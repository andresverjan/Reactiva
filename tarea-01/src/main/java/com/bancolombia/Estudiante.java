package com.bancolombia;

import lombok.Data;

@Data
public class Estudiante {
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private String signo;

    public Estudiante(String nombre, String apellido, String telefono, int edad, String signo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.signo = signo;
    }
}
