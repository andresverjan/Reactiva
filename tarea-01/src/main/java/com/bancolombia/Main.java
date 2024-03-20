package com.bancolombia;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Pérez", "123456789", 30, "Aries");
        Persona persona2 = new Persona("María", "Gómez", "987654321", 25, "Virgo");
        Persona persona3 = new Persona("Carlos", "Martínez", "555444333", 40, "Capricornio");
        Persona persona4 = new Persona("Laura", "Rodríguez", "111222333", 35, "Tauro");
        Persona persona5 = new Persona("Pedro", "Sánchez", "999888777", 28, "Leo");
        Persona persona6 = new Persona("Ana", "Fernández", "666777888", 22, "Acuario");
        Persona persona7 = new Persona("David", "López", "333222111", 45, "Cáncer");
        Persona persona8 = new Persona("Sofía", "Díaz", "777666555", 32, "Géminis");
        Persona persona9 = new Persona("Javier", "Hernández", "888999000", 27, "Escorpio");
        Persona persona10 = new Persona("Elena", "García", "112233445", 33, "Libra");
        Persona persona11 = new Persona("Pablo", "Muñoz", "554433221", 38, "Piscis");
        Persona persona12 = new Persona("Rosa", "Jiménez", "998877665", 29, "Sagitario");

        List<Persona> personas = List.of(persona1, persona2, persona3, persona4, persona5, persona6, persona7, persona8, persona9, persona10, persona11, persona12);


        firstTask(personas);

        secondTask(personas);

        thirdTask(personas);

        fourthTask(personas);

    }

    private static List<Persona> firstTask(List<Persona> personas) {
        List<Persona> estudiantesAcuario = new ArrayList<>();

        for (Persona persona : personas) {
            if (persona.getSigno().equals("Acuario")) {
                estudiantesAcuario.add(persona);
            }
        }

        System.out.println("Estudiantes con signo Acuario:");
        estudiantesAcuario.forEach(System.out::println);
        System.out.println();

        return personas;
    }

    private static List<Persona> secondTask(List<Persona> personas) {
        List<Persona> estudiantesMayoresde25 = new ArrayList<>();

        for (Persona persona : personas) {
            if (persona.getEdad() > 25) {
                estudiantesMayoresde25.add(persona);
            }
        }

        System.out.println("Estudiantes mayores de 25 años:");
        estudiantesMayoresde25.forEach(System.out::println);
        System.out.println();

        return personas;
    }

    // Obtener los estudiantes con signo acuario
    private static List<Persona> thirdTask(List<Persona> personas) {
        var estudiantesAcuario = personas.stream().filter(persona -> persona.getSigno().equals("Acuario")).toList();

        System.out.println("Estudiantes con signo Acuario:");
        estudiantesAcuario.forEach(System.out::println);
        System.out.println();

        return estudiantesAcuario;
    }

    // Obtener los estudiantes mayores de 25 años
    private static List<Persona> fourthTask(List<Persona> personas) {
        var estudiantesMayoresde25 = personas.stream().filter(persona -> persona.getEdad() > 25).toList();

        System.out.println("Estudiantes mayores de 25 años:");
        estudiantesMayoresde25.forEach(System.out::println);
        System.out.println();

        return estudiantesMayoresde25;
    }

    //
}