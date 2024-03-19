package org.example;

import org.example.model.Persona;

import java.util.List;

public class Main {

    /*
    1. Usando el modo declarativo obtener todos los estudiantes que son de signo acuario.
    2. Usando el modo declarativo obtener todos los estudiantes donde la edad es mayor a 25.
    3. Usando el modo imperativo obtener todos los estudiantes que son de signo acuario.
    4. Usando el modo imperativo obtener todos los estudiantes donde la edad es mayor a 25.
    */

    public static void main(String[] args) {
        List<Persona> personas = buildListPersona();
        String signo = "acuario";
        int edad = 25;

        printPersonasPorSignoDeclarativo(personas, signo);
        printPersonasPorSignoImperativo(personas, signo);
        printPersonasMayorEdadDeclarativo(personas, edad);
        printPersonasMayorEdadImperativa(personas, edad);
    }

    public static void printPersonasPorSignoDeclarativo(List<Persona> personas, String signo) {
        System.out.println("1. Usando el modo declarativo obtener todos los estudiantes que son de signo "
                .concat(signo).concat(".\n"));
        personas.stream()
                .filter(persona -> persona.getSigno().equalsIgnoreCase(signo))
                .forEach(System.out::println);
    }

    public static void printPersonasPorSignoImperativo(List<Persona> personas, String signo) {
        System.out.println("\n3. Usando el modo imperativo obtener todos los estudiantes que son de signo "
                .concat(signo).concat(".\n"));
        for (Persona persona : personas) {
            if (persona.getSigno().equalsIgnoreCase(signo)) {
                System.out.println(persona);
            }
        }
    }

    public static void printPersonasMayorEdadDeclarativo(List<Persona> personas, int edad) {
        System.out.println("\n2. Usando el modo declarativo obtener todos los estudiantes donde la edad es mayor a "
                .concat(String.valueOf(edad)).concat(".\n"));
        personas.stream()
                .filter(persona -> persona.getEdad() > 25)
                .forEach(System.out::println);
    }

    public static void printPersonasMayorEdadImperativa(List<Persona> personas, int edad) {
        System.out.println("\n4. Usando el modo imperativo obtener todos los estudiantes donde la edad es mayor a "
                .concat(String.valueOf(edad)).concat(".\n"));
        for (Persona persona : personas) {
            if (persona.getEdad() > 25) {
                System.out.println(persona);
            }
        }
    }

    public static List<Persona> buildListPersona(){
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
        return List.of(persona1, persona2, persona3, persona4, persona5, persona6,
                persona7, persona8, persona9, persona10, persona11, persona12);
    }
}