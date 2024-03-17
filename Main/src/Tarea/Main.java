package Tarea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();

        // Crear estudiantes y agregarlos a la lista
        estudiantes.add(new Estudiante("Juan", "Pérez", "123456789", 30, "Aries"));
        estudiantes.add(new Estudiante("María", "Gómez", "987654321", 25, "Virgo"));
        estudiantes.add(new Estudiante("Carlos", "Martínez", "555444333", 40, "Capricornio"));
        estudiantes.add(new Estudiante("Laura", "Rodríguez", "111222333", 35, "Tauro"));
        estudiantes.add(new Estudiante("Pedro", "Sánchez", "999888777", 28, "Leo"));
        estudiantes.add(new Estudiante("Ana", "Fernández", "666777888", 22, "Acuario"));
        estudiantes.add(new Estudiante("David", "López", "333222111", 45, "Cáncer"));
        estudiantes.add(new Estudiante("Sofía", "Díaz", "777666555", 32, "Géminis"));
        estudiantes.add(new Estudiante("Javier", "Hernández", "888999000", 27, "Escorpio"));
        estudiantes.add(new Estudiante("Elena", "García", "112233445", 33, "Libra"));
        estudiantes.add(new Estudiante("Pablo", "Muñoz", "554433221", 38, "Piscis"));
        estudiantes.add(new Estudiante("Rosa", "Jiménez", "998877665", 29, "Sagitario"));


        // Modo declarativo para estudiantes de signo "Acuario"
        List<Estudiante> estudiantesAcuario = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getSigno() != null && estudiante.getSigno().equalsIgnoreCase("Acuario")) {
                estudiantesAcuario.add(estudiante);
            }
        }

        // Modo declarativo para estudiantes mayores de 25 años
        List<Estudiante> estudiantesMayores25 = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getEdad() > 25) {
                estudiantesMayores25.add(estudiante);
            }
        }

        // Imprimir los resultados
        System.out.println("Estudiantes de signo Acuario:");
        for (Estudiante estudiante : estudiantesAcuario) {
            System.out.println(estudiante.getNombre() + " " + estudiante.getApellido());
        }

        System.out.println("\nEstudiantes mayores de 25 años:");
        for (Estudiante estudiante : estudiantesMayores25) {
            System.out.println(estudiante.getNombre() + " " + estudiante.getApellido());
        }
    }
}
