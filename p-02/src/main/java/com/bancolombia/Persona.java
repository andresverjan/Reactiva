package com.bancolombia;

import io.reactivex.subjects.PublishSubject;

import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Objects;

@Getter
@EqualsAndHashCode
public class Persona {
    private transient PublishSubject<List<Object>> events = PublishSubject.create();
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private String signo;

    public Persona(String nombre, String apellido, String telefono, int edad, String signo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.signo = signo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

        this.events.onNext(List.of("nombre", this));
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        this.events.onNext(List.of("apellido", this));
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
        this.events.onNext(List.of("telefono", this));
    }

    public void setEdad(int edad) {
        this.edad = edad;
        this.events.onNext(List.of("edad", this));
    }

    public void setSigno(String signo) {
        this.signo = signo;
        this.events.onNext(List.of("signo", this));
    }

    @Override
    public String toString() {
        return "Persona( " +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                ", signo='" + signo + '\'' +
                " )";
    }
}

