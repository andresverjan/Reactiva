package org.example.model;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;


public class Persona {
    @Getter
    private String nombre;
    @Getter
    private String apellido;
    @Getter
    private String telefono;
    @Getter
    private int edad;
    @Getter
    private String signo;

    private PublishSubject<PublishPersona> personaObservable = PublishSubject.create();

    public Observable<PublishPersona> getPersonaObservable() {
        return personaObservable.hide();
    }

    public void setNombre(String nombre) {
        var oldValue = this.nombre;
        this.nombre = nombre;
        personaObservable.onNext(new PublishPersona("nombre", oldValue, nombre));
    }

    public void setApellido(String apellido) {
        var oldValue = this.apellido;
        this.apellido = apellido;
        personaObservable.onNext(new PublishPersona("apellido", oldValue, apellido));
    }

    public void setTelefono(String telefono) {
        var oldValue = this.telefono;
        this.telefono = telefono;
        personaObservable.onNext(new PublishPersona("telefono", oldValue, telefono));
    }

    public void setEdad(int edad) {
        var oldValue = this.edad;
        if (edad > 150){
//            personaObservable.onError(new IllegalArgumentException("Edad no valida"));
            personaObservable.onNext(new PublishPersona("edad", getFechaNacimientoByEdad(oldValue), "Edad no valida"));
            return;
        }
        this.edad = edad;
        personaObservable.onNext(new PublishPersona("edad", getFechaNacimientoByEdad(oldValue), getFechaNacimientoByEdad(edad)));
    }

    public void setSigno(String signo) {
        var oldValue = this.signo;
        this.signo = signo;
        personaObservable.onNext(new PublishPersona("signo", oldValue, signo));
    }

    public String getFechaNacimientoByEdad(int edad){
        return (LocalDate.now().getYear() - edad) + "-01-01";
    }

}