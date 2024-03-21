package co.com.funcional;

import java.util.ArrayList;

public class ObtenerDatos {


    public static void buscarSignoAcuario(ArrayList<Estudiante> estudiantes, String signo) {
        long Acuarianos = estudiantes.stream()
                .filter(estudiante -> estudiante.getSigno().equals(signo))
                .peek(estudiante -> System.out.println(estudiante.getNombre() + " " + estudiante.getApellido() + " tiene signo Acuario"))
                .count();

        System.out.println("Total de estudiantes con signo Acuario: " + Acuarianos);
    }

    public static void buscarAcuarioImp(ArrayList<Estudiante> estudiantes, String signo) {

        ArrayList<Estudiante> acuarianos = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getSigno().equals(signo)) {
                acuarianos.add(estudiante);
                System.out.println(estudiante.getNombre() + " " + estudiante.getApellido() + " tiene signo Acuario");
            }
        }

        System.out.println("Total de estudiantes acuarianos: " + acuarianos.size());
    }

    public static void buscarmayoresDec(ArrayList<Estudiante> estudiantes, int edad) {
        long mayores = estudiantes.stream()
                .filter(estudiante -> estudiante.getEdad() > edad)
                .peek(estudiante -> System.out.println(estudiante.getNombre() + " "
                        + estudiante.getApellido() + " es mayor de 25 años"))
                .count();

        System.out.println("Total de estudiantes mayores a 25 años es: " + mayores);
    }

    public static void buscarMayoresImp(ArrayList<Estudiante> estudiantes, int edad) {

        ArrayList<Estudiante> mayores = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getEdad() > edad) {
                mayores.add(estudiante);
                System.out.println(estudiante.getNombre() + " " + estudiante.getApellido() + " es mayor de 25 años");
            }
        }

        System.out.println("Total de estudiantes acuarianos: " + mayores.size());
    }


}
