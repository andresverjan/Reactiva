package org.java;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

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
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                ", signo='" + signo + '\'' +
                '}';
    }
}
