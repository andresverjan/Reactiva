import jdk.jshell.PersistentSnippet;
import model.Persona;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

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

        List<Persona> personasList = List.of(persona1,persona2,persona3,persona4,persona5,persona6,persona7,
                persona8,persona9,persona10,persona11,persona12);
        System.out.println(bringAquarius(personasList));
        System.out.println(bringAge(personasList));
        System.out.println(bringAquariusOld(personasList));
        System.out.println(bringAgeOld(personasList));

    }

    static List<Persona> bringAquarius(List<Persona> personasList){
        return personasList.stream().filter(s -> s.getSigno().equalsIgnoreCase("acuario")).toList();
    }

    static List<Persona> bringAge(List<Persona> personasList){
        return personasList.stream().filter(s -> s.getEdad()>25).toList();
    }

    static List<Persona> bringAquariusOld(List<Persona> personasList){
        List<Persona> list = new ArrayList<>();
        for (Persona persona : personasList)
        {
            if (persona.getSigno().equalsIgnoreCase("acuario")){
                list.add(persona);
            }
        }
        return list;
    }

    static List<Persona> bringAgeOld(List<Persona> personasList){
        List<Persona> list = new ArrayList<>();
        for (Persona persona : personasList)
        {
            if (persona.getEdad()>25){
                list.add(persona);
            }
        }
        return list;
    }
}