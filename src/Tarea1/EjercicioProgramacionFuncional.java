/*El objetivo de esta tarea es lograr aplicar los conceptos vistos en clases sobre la programacion funcional: (Stream, funciones puras,
 recursividad, composición de funciones)

        Enunciado:
Dadas las siguientes propiedades, crear la clase estudiante con sus atributos get y set: (usar lombook si es posible)
private String nombre;
private String apellido;
private String telefono;
private int edad;
private String signo;

        Data de entrada:
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

        Obtener:

        1. Usando el modo declarativo obtener todos los estudiantes que son de signo acuario.
        2. Usando el modo declarativo obtener todos los estudiantes donde la edad es mayor a 25.
        3. Usando el modo imperativo obtener todos los estudiantes que son de signo acuario.
        4. Usando el modo imperativo obtener todos los estudiantes donde la edad es mayor a 25.*/
package src.Tarea1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EjercicioProgramacionFuncional {

    public static void main(String[] args) {

        Estudiante estudiante1 = new  Estudiante("Juan", "Pérez", "123456789", 30, "Aries");
        Estudiante estudiante2 = new  Estudiante("María", "Gómez", "987654321", 25, "Virgo");
        Estudiante estudiante3 = new  Estudiante("Carlos", "Martínez", "555444333", 40, "Capricornio");
        Estudiante estudiante4 = new  Estudiante("Laura", "Rodríguez", "111222333", 35, "Tauro");
        Estudiante estudiante5 = new  Estudiante("Pedro", "Sánchez", "999888777", 28, "Leo");
        Estudiante estudiante6 = new  Estudiante("Ana", "Fernández", "666777888", 22, "Acuario");
        Estudiante estudiante7 = new  Estudiante("David", "López", "333222111", 45, "Cáncer");
        Estudiante estudiante8 = new  Estudiante("Sofía", "Díaz", "777666555", 32, "Géminis");
        Estudiante estudiante9 = new  Estudiante("Javier", "Hernández", "888999000", 27, "Escorpio");
        Estudiante estudiante10 = new Estudiante("Elena", "García", "112233445", 33, "Libra");
        Estudiante estudiante11 = new Estudiante("Pablo", "Muñoz", "554433221", 38, "Piscis");
        Estudiante estudiante12 = new Estudiante("Rosa", "Jiménez", "998877665", 29, "Sagitario");

       // System.out.println(estudiante11.getNombre().toString()); // prueba imprimir nombre est 11


        List<Estudiante> estudiantes = List.of(
                estudiante1, estudiante2, estudiante3, estudiante4, estudiante5, estudiante6,
                estudiante7, estudiante8, estudiante9, estudiante10, estudiante11, estudiante12
        );

        //1. Usando el modo declarativo obtener todos los estudiantes que son de signo acuario.

        // Filtrar estudiantes de signo "Acuario"
        List<Estudiante> estudiantesAcuario = estudiantes.stream()
                .filter(estudiante -> estudiante.getSigno().equals("Acuario")).collect(Collectors.toList());

       // Imprimir los estudiantes de signo acuario
        System.out.println("1. Estudiantes que son de signo acuario modo declarativo: ");
        estudiantesAcuario.forEach(estudiante -> System.out.println(estudiante.getNombre() + " " + estudiante.getApellido()));
        System.out.println("**********************************: ");
        //2. Usando el modo declarativo obtener todos los estudiantes donde la edad es mayor a 25

        List<Estudiante> estudiantesMayores25 = estudiantes.stream()
                .filter(estudiante -> estudiante.getEdad()>25).toList();

        // Imprimir los estudiantes edad >25
        System.out.println("2. Estudiantes que son mayores de 25 años modo declarativo: ");
        estudiantesMayores25.forEach(estudiante -> System.out.println(estudiante.getNombre() + " " + estudiante.getApellido() + " " + estudiante.getEdad()));
        System.out.println("**********************************: ");

        //3. Usando el modo imperativo obtener todos los estudiantes que son de signo acuario.
        System.out.println("3. Estudiantes que son de signo acuario modo imperativo: ");
        for (Estudiante estudiante : estudiantes) {
            if ("Acuario".equals(estudiante.getSigno())) {
                estudiantesAcuario.add(estudiante);
                System.out.println(estudiante.getNombre() + " " + estudiante.getApellido() );
            }
        }
        System.out.println("**********************************: ");

        //4. Usando el modo imperativo obtener todos los estudiantes donde la edad es mayor a 25.
        System.out.println("4. Estudiantes que son mayores de 25 años modo imperativo: ");
       // List<Estudiante> estudiantesMayoresDe25 = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getEdad() > 25) {
            //    estudiantesMayoresDe25.add(estudiante);
                System.out.println(estudiante.getNombre() + " " + estudiante.getApellido() + " " + estudiante.getEdad());
               }
        }
            System.out.println("**********************************: ");
        }
        }