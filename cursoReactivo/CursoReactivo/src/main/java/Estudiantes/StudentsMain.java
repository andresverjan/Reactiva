package Estudiantes;

import java.util.ArrayList;
import java.util.List;

public class StudentsMain {
    public static void main(String[] args) {
        List<Student> listaEstudiantes = new ArrayList<>();
        agregarEstudiantesALista(listaEstudiantes);

        StudentsOperations studentsOperations = new StudentsOperations();

        System.out.println("Estudiantes de signo Acuario:");
        List<Student> acuarioStudents = studentsOperations.getBySign(listaEstudiantes, "Acuario");
        imprimirEstudiantes(acuarioStudents);

        System.out.println("\nEstudiantes mayores de 25 años:");
        List<Student> olderThan25Students = studentsOperations.getOlderThan(listaEstudiantes,25);
        imprimirEstudiantes(olderThan25Students);

        System.out.println("\nEstudiantes de signo Acuario de forma imperativa:");
        List<Student> acuarioStudentsImperative = studentsOperations.getBySign(listaEstudiantes, "Acuario");
        imprimirEstudiantes(acuarioStudentsImperative);

        System.out.println("\nEstudiantes mayores de 25 años de forma imperativa:");
        List<Student> olderThan25StudentsImperative = studentsOperations.getOlderThan(listaEstudiantes,25);
        imprimirEstudiantes(olderThan25StudentsImperative);
    }


    public static void agregarEstudiantesALista(List<Student> listaEstudiantes) {
        listaEstudiantes.add(new Student("Juan", "Pérez", "123456789", 30, "Aries"));
        listaEstudiantes.add(new Student("María", "Gómez", "987654321", 25, "Virgo"));
        listaEstudiantes.add(new Student("Carlos", "Martínez", "555444333", 40, "Capricornio"));
        listaEstudiantes.add(new Student("Laura", "Rodríguez", "111222333", 35, "Tauro"));
        listaEstudiantes.add(new Student("Pedro", "Sánchez", "999888777", 28, "Leo"));
        listaEstudiantes.add(new Student("Ana", "Fernández", "666777888", 22, "Acuario"));
        listaEstudiantes.add(new Student("David", "López", "333222111", 45, "Cáncer"));
        listaEstudiantes.add(new Student("Sofía", "Díaz", "777666555", 32, "Géminis"));
        listaEstudiantes.add(new Student("Javier", "Hernández", "888999000", 27, "Escorpio"));
        listaEstudiantes.add(new Student("Elena", "García", "112233445", 33, "Libra"));
        listaEstudiantes.add(new Student("Pablo", "Muñoz", "554433221", 38, "Piscis"));
        listaEstudiantes.add(new Student("Rosa", "Jiménez", "998877665", 29, "Sagitario"));
    }

    public static void imprimirEstudiantes(List<Student> estudiantes) {
        for (Student estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + " " + estudiante.getApellido() +
                    " - Edad: " + estudiante.getEdad() + ", Signo: " + estudiante.getSigno());
        }
    }
}
