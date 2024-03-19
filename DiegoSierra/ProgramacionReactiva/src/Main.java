import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static List<Persona> obtenerEstudiantesAcuario(List<Persona> estudiantes, String signo) {
        return estudiantes.stream()
                .filter(estudiante -> Objects.equals(estudiante.getSigno(), signo))
                .collect(Collectors.toList());
    }
    public static List<Persona> obtenerEstudiantesEdadMayorA25(List<Persona> estudiantes, Integer edad) {
        return estudiantes.stream()
                .filter(estudiante -> estudiante.getEdad() > edad)
                .collect(Collectors.toList());
    }
    public static List<Persona> obtenerEstudiantesAcuarioImperativo(List<Persona> estudiantes, String signo) {
        List<Persona> estudiantesAcuario = new ArrayList<>();
        for (Persona estudiante : estudiantes) {
            if (signo.equalsIgnoreCase(estudiante.getSigno())) {
                estudiantesAcuario.add(estudiante);
            }
        }
        return estudiantesAcuario;
    }
    public static List<Persona> obtenerEstudiantesEdadMayorA25Imperativo(List<Persona> estudiantes, Integer edad) {
        List<Persona> estudiantesEdadMayorA25 = new ArrayList<>();
        for (Persona estudiante : estudiantes) {
            if (estudiante.getEdad() > edad) {
                estudiantesEdadMayorA25.add(estudiante);
            }
        }
        return estudiantesEdadMayorA25;
    }

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

        List<Persona> personas = Arrays.asList(persona1, persona2, persona3,persona4,persona5,persona6,persona7,persona8,persona9,persona10,persona11,persona12);
        List<Persona> estudiantesAcuario = obtenerEstudiantesAcuario(personas, "Acuario");
        List<Persona> estudiantesMayor25 = obtenerEstudiantesEdadMayorA25(personas, 25);
        List<Persona> estudiantesAcuarioImperativo = obtenerEstudiantesAcuarioImperativo(personas,"Acuario");
        List<Persona> estudiantesEdadMayorA25Imperativo = obtenerEstudiantesEdadMayorA25Imperativo(personas,25);

        System.out.println("Estudiantes del signo Acuario:");
        for (Persona estudiante : estudiantesAcuario) {
            System.out.println(estudiante.getNombre() + " " + estudiante.getApellido());
        }
        System.out.println("Estudiantes Mayor a 25:");
        for (Persona estudiante : estudiantesMayor25) {
            System.out.println(estudiante.getNombre() + " " + estudiante.getApellido());
        }
        System.out.println("Estudiantes del signo Acuario Imperativo:");
        for (Persona estudiante : estudiantesAcuarioImperativo) {
            System.out.println(estudiante.getNombre() + " " + estudiante.getApellido());
        }
        System.out.println("Estudiantes Mayor a 25 Imperativo:");
        for (Persona estudiante : estudiantesEdadMayorA25Imperativo) {
            System.out.println(estudiante.getNombre() + " " + estudiante.getApellido());
        }

    }
}