import model.Persona;

import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {
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
        List<Persona> listPersonas = List.of(persona1, persona2, persona3, persona4, persona5, persona6, persona7, persona8, persona9, persona10, persona11, persona12);
        int edadBuscar = 25;
        String signoBuscar = "Acuario";
        metodoDeclarativo(listPersonas, edadBuscar, signoBuscar);
        metodoImperativo(listPersonas, edadBuscar, signoBuscar);
    }

    private static void metodoImperativo(List<Persona> listPersonas, int anios, String signo) {
        List<Persona> personaSigno = listPersonas.stream().filter(o -> o.getSigno().equalsIgnoreCase(signo))
                .toList();
        List<Persona> personaAnio = listPersonas.stream().filter(o -> o.getEdad() > anios).toList();
        System.out.println("LAS PERSONAS DEL SIGNO" + signo + " SON : " + personaSigno);
        System.out.println("LAS PERSONAS MAYORES DE " + anios + "  SON : " + personaAnio);
    }

    private static void metodoDeclarativo(List<Persona> listPersonas, int anios, String signo) {
        List<Persona> listSigno = new ArrayList<>();
        List<Persona> listAnios = new ArrayList<>();
        for (Persona persona : listPersonas) {
            if (persona.getSigno().equalsIgnoreCase(signo)) {
                listSigno.add(persona);
            }
            if (persona.getEdad() > anios) {
                listAnios.add(persona);
            }
        }
        System.out.println("LAS PERSONAS DEL SIGNO" + signo + " SON : " + listSigno);
        System.out.println("LAS PERSONAS MAYORES DE " + anios + "  SON : " + listAnios);
    }
}
