package org.example.model;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
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
        return personaObservable;
    }

    public void setNombre(String nombre) {
        var valorAnterior = this.nombre;
        this.nombre = nombre;
        personaObservable.onNext(new PublishPersona("nombre", valorAnterior, nombre));
    }

    public void setApellido(String apellido) {
        var valorAnterior = this.apellido;
        this.apellido = apellido;
        personaObservable.onNext(new PublishPersona("apellido", valorAnterior, apellido));
    }

    public void setTelefono(String telefono) {
        var valorAnterior = this.telefono;
        this.telefono = telefono;
        personaObservable.onNext(new PublishPersona("telefono", valorAnterior, telefono));
    }

    public void setEdad(int edad) {
        var valorAnterior = this.edad;
        if (edad > 150){
//            personaObservable.onError(new IllegalArgumentException("Edad no valida"));
            personaObservable.onNext(new PublishPersona("edad", getFechaNacimientoByEdad(valorAnterior), "Edad no valida"));
            return;
        }
        this.edad = edad;
        personaObservable.onNext(new PublishPersona("edad", getFechaNacimientoByEdad(valorAnterior), getFechaNacimientoByEdad(edad)));
    }

    public void setSigno(String signo) {
        var valorAnterior = this.signo;
        this.signo = signo;
        personaObservable.onNext(new PublishPersona("signo", valorAnterior, signo));
    }

    public String getFechaNacimientoByEdad(int edad){
        return (LocalDate.now().getYear() - edad) + "-01-01";
    }

}