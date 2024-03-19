package com.bancolombia;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estudiante persona1 = new Estudiante("Juan", "Pérez", "123456789", 30, "Aries");
        Estudiante persona2 = new Estudiante("María", "Gómez", "987654321", 25, "Virgo");
        Estudiante persona3 = new Estudiante("Carlos", "Martínez", "555444333", 40, "Capricornio");
        Estudiante persona4 = new Estudiante("Laura", "Rodríguez", "111222333", 35, "Tauro");
        Estudiante persona5 = new Estudiante("Pedro", "Sánchez", "999888777", 28, "Leo");
        Estudiante persona6 = new Estudiante("Ana", "Fernández", "666777888", 22, "Acuario");
        Estudiante persona7 = new Estudiante("David", "López", "333222111", 45, "Cáncer");
        Estudiante persona8 = new Estudiante("Sofía", "Díaz", "777666555", 32, "Géminis");
        Estudiante persona9 = new Estudiante("Javier", "Hernández", "888999000", 27, "Escorpio");
        Estudiante persona10 = new Estudiante("Elena", "García", "112233445", 33, "Libra");
        Estudiante persona11 = new Estudiante("Pablo", "Muñoz", "554433221", 38, "Piscis");
        Estudiante persona12 = new Estudiante("Rosa", "Jiménez", "998877665", 29, "Sagitario");

        List<Estudiante> estudiantes = List.of(persona1, persona2, persona3, persona4, persona5, persona6, persona7, persona8, persona9, persona10, persona11, persona12);


        firstTask(estudiantes);

        secondTask(estudiantes);

        thirdTask(estudiantes);

        fourthTask(estudiantes);

    }

    private static List<Estudiante> firstTask(List<Estudiante> estudiantes) {
        List<Estudiante> estudiantesAcuario = new ArrayList<>();

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getSigno().equals("Acuario")) {
                estudiantesAcuario.add(estudiante);
            }
        }

        System.out.println("Estudiantes con signo Acuario:");
        estudiantesAcuario.forEach(System.out::println);

        return estudiantes;
    }

    private static List<Estudiante> secondTask(List<Estudiante> estudiantes) {
        List<Estudiante> estudiantesMayoresde25 = new ArrayList<>();

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getEdad() > 25) {
                estudiantesMayoresde25.add(estudiante);
            }
        }

        System.out.println("Estudiantes mayores de 25 años:");
        estudiantesMayoresde25.forEach(System.out::println);

        return estudiantes;
    }

    // Obtener los estudiantes con signo acuario
    private static List<Estudiante> thirdTask(List<Estudiante> estudiantes) {
        var estudiantesAcuario = estudiantes.stream().filter(estudiante -> estudiante.getSigno().equals("Acuario")).toList();

        System.out.println("Estudiantes con signo Acuario:");
        estudiantesAcuario.forEach(System.out::println);

        return estudiantesAcuario;
    }

    // Obtener los estudiantes mayores de 25 años
    private static List<Estudiante> fourthTask(List<Estudiante> estudiantes) {
        var estudiantesMayoresde25 = estudiantes.stream().filter(estudiante -> estudiante.getEdad() > 25).toList();

        System.out.println("Estudiantes mayores de 25 años:");
        estudiantesMayoresde25.forEach(System.out::println);

        return estudiantesMayoresde25;
    }

    //
}