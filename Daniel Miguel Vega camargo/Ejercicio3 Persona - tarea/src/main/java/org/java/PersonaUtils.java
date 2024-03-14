package org.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonaUtils {
    public static List<Persona> inicializarPersonas() {
        ArrayList<Persona> lista = new ArrayList<>();

        lista.add(new Persona("Juan", "Pérez", "123456789", 30, "Aries"));
        lista.add(new Persona("María", "Gómez", "987654321", 25, "Virgo"));
        lista.add(new Persona("Carlos", "Martínez", "555444333", 40, "Capricornio"));
        lista.add(new Persona("Laura", "Rodríguez", "111222333", 35, "Tauro"));
        lista.add(new Persona("Pedro", "Sánchez", "999888777", 28, "Leo"));
        lista.add(new Persona("Ana", "Fernández", "666777888", 22, "Acuario"));
        lista.add(new Persona("David", "López", "333222111", 45, "Cáncer"));
        lista.add(new Persona("Sofía", "Díaz", "777666555", 32, "Géminis"));
        lista.add(new Persona("Javier", "Hernández", "888999000", 27, "Escorpio"));
        lista.add(new Persona("Elena", "García", "112233445", 33, "Libra"));
        lista.add(new Persona("Pablo", "Muñoz", "554433221", 38, "Piscis"));
        lista.add(new Persona("Rosa", "Jiménez", "998877665", 29, "Sagitario"));

        return lista;
    }

    public static List<Persona> filtrarPorSignoDeclarativo(List<Persona> lista, String signo) {
        List<Persona> personasFiltradas = new ArrayList<>();
        for (Persona persona : lista) {
            if (persona.getSigno().equals(signo)) {
                personasFiltradas.add(persona);
            }
        }
        return personasFiltradas;
    }

    public static List<Persona> filtrarPorEdadDeclarativo(List<Persona> lista, int edadMinima) {
        List<Persona> personasFiltradas = new ArrayList<>();
        for (Persona persona : lista) {
            if (persona.getEdad() > edadMinima) {
                personasFiltradas.add(persona);
            }
        }
        return personasFiltradas;
    }
    public static List<Persona> filtrarPorSignoImperativo(List<Persona> lista, String signo) {
        return lista.stream().
                filter(p -> p.getSigno().equals(signo))
                .collect(Collectors.toList());
    }
    public static List<Persona> filtrarPorEdadImperativo(List<Persona> lista, int edadMinima) {
        return lista.stream().
                filter(p -> p.getEdad() > edadMinima)
                .collect(Collectors.toList());
    }


}
