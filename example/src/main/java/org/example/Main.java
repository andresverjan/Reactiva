package org.example;

import java.util.*;
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


        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Por favor, elige una opción:");
            System.out.println("1. Obtener personas por signo (declarativo)");
            System.out.println("2. Obtener personas por edad (declarativo)");
            System.out.println("3. Obtener personas por signo (imperativo)");
            System.out.println("4. Obtener personas por edad (imperativo)");
            System.out.println("5. Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1" -> {
                    System.out.println("Por favor, introduce el signo.");
                    String signo = scanner.nextLine();
                        System.out.println(obtenerPersonasPorSignoDeclarativo(personas, signo));

                }
                case "2" -> {
                    System.out.println("Por favor, introduce la edad.");
                    int edad = scanner.nextInt();

                    System.out.println(obtenerPersonasPorEdadDeclarativo(personas, edad));
                }
                case "3" -> {
                    System.out.println("Por favor, introduce el signo.");
                    String signo = scanner.nextLine();
                        System.out.println(obtenerPersonasPorSignoImperativo(personas, signo));
                }
                case "4" -> {
                    System.out.println("Por favor, introduce la edad.");
                    int edad = scanner.nextInt();
                    System.out.println(obtenerPersonasPorEdadImperativo(personas, edad));
                }
                case "5" -> {
                    System.out.println("Saliendo.....");
                    return;
                }
                default -> System.out.println("Opción no válida.Por favor, intente de nuevo.");
            }
        }
    }

    public static List<Persona> obtenerPersonasPorSignoDeclarativo(List<Persona> personas, String signo) {
        return personas.stream()
                .filter(p -> p.getSigno().equalsIgnoreCase(signo))
                .toList();
    }

    public static List<Persona> obtenerPersonasPorEdadDeclarativo(List<Persona> personas, int edad) {
        return personas.stream()
                .filter(p -> p.getEdad() > edad)
                .toList();
    }

    public static List<Persona> obtenerPersonasPorSignoImperativo(List<Persona> personas, String signo) {
        List<Persona> resultado = new ArrayList<>();
        for(Persona p : personas) {
            if(p.getSigno().equalsIgnoreCase(signo)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public static List<Persona> obtenerPersonasPorEdadImperativo(List<Persona> personas, int edad) {
        List<Persona> resultado = new ArrayList<>();
        for (Persona p : personas) {
            if (p.getEdad() > edad) {
                resultado.add(p);
            }
        }
        return resultado;

    }
}

