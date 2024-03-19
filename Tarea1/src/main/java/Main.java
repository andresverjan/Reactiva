import java.util.Arrays;
import java.util.List;

public class Main {

    private static final String ACUARIO = "Acuario";

    public static void main(String[] args) {

        puntoUno();
        System.out.println("////");

        puntoDos();
        System.out.println("////");

        puntoTres();
        System.out.println("////");

        puntoCuatro();
    }

    private static void puntoCuatro() {
        toList().stream().filter(p -> p.getEdad() > 25)
                .forEach(System.out::println);

    }

    private static void puntoTres() {
        toList().stream().filter(p -> p.getSigno().equalsIgnoreCase(ACUARIO))
                .forEach(System.out::println);
    }

    private static void puntoDos() {
        for (Persona p : toList()
        ) {
            if (p.getEdad() > 25) {
                System.out.println(p);
            }
        }
    }


    private static void puntoUno() {
        for (Persona p : toList()
        ) {
            if (p.getSigno().equalsIgnoreCase(ACUARIO)) {
                System.out.println(p);
            }
        }
    }


    private static List<Persona> toList() {
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
        return Arrays.asList(persona1, persona2
                , persona3, persona4, persona5, persona6, persona7, persona8, persona9, persona10, persona12, persona11);
    }

}
