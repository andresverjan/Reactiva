package org.example;

import io.reactivex.Observable;
import io.reactivex.Observer;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Persona {
    private String nombre;

    private String apellido;
    private String telefono;
    private int edad;
    private String signo;

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", signo='" + signo + '\'' +
                "}\n";
    }
}
