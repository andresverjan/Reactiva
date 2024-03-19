package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Juan", "Pérez", "123456789", 30, "Aries"),
                new Persona("María", "Gómez", "987654321", 25, "Virgo"),
                new Persona("Carlos", "Martínez", "555444333", 40, "Capricornio"),
                new Persona("Laura", "Rodríguez", "111222333", 35, "Tauro"),
                new Persona("Pedro", "Sánchez", "999888777", 28, "Leo"),
                new Persona("Ana", "Fernández", "666777888", 22, "Acuario"),
                new Persona("David", "López", "333222111", 45, "Cáncer"),
                new Persona("Sofía", "Díaz", "777666555", 32, "Géminis"),
                new Persona("Javier", "Hernández", "888999000", 27, "Escorpio"),
                new Persona("Elena", "García", "112233445", 33, "Libra"),
                new Persona("Pablo", "Muñoz", "554433221", 38, "Piscis"),
                new Persona("Rosa", "Jiménez", "998877665", 29, "Sagitario")
        );

        // Modo Declarativo
        List<Persona> acuario = personas.stream()
                        .filter(p ->"Acuario".equalsIgnoreCase(p.getSigno()))
                .toList();

        List<Persona> mayores25 = personas.stream()
                        .filter(p -> p.getEdad() > 25)
                                .toList();

        System.out.println("Persona de signo acuario");
        System.out.println("**************");
        System.out.println("**************");
        acuario.forEach(System.out::println);


        System.out.println("Personas mayores a 25 años");
        System.out.println("**************");
        System.out.println("**************");
        mayores25.forEach(System.out::println);



        //Modo imperativo
        List<Persona> acuarioImperativo = new ArrayList<>();
        for (Persona p : personas) {
            if ("Acuario".equalsIgnoreCase(p.getSigno())) {
                acuarioImperativo.add(p);
            }
        }

        List<Persona> mayores25_2 = new ArrayList<>();
        for (Persona p: personas) {
            if (p.getEdad() > 25) {
                mayores25_2.add(p);
            }
        }

        System.out.println("Persona de signo acuario");
        System.out.println("**************");
        System.out.println("**************");
        for (Persona p: acuario) {
            System.out.println(p);
        }

        System.out.println("Personas mayores a 25 años");
        System.out.println("**************");
        System.out.println("**************");
        for (Persona p: mayores25_2) {
            System.out.println(p);
        }
    }

}