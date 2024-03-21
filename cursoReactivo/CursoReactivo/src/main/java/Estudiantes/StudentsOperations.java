package Estudiantes;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsOperations {


    public List<Student> getBySign(List<Student> students, String sign){
        return students.stream()
                .filter(estudiante -> estudiante.getSigno().equalsIgnoreCase(sign))
                .collect(Collectors.toList());
    }

    public List<Student> getOlderThan(List<Student> students, int age){
        return students.stream()
                .filter(estudiante -> estudiante.getEdad() > age)
                .collect(Collectors.toList());
    }

    public List<Student> getBySignImperative(List<Student> students, String sign){
        List<Student> estudiantesAcuario = new ArrayList<>();
        for (Student estudiante : students) {
            if (estudiante.getSigno().equalsIgnoreCase(sign)) {
                estudiantesAcuario.add(estudiante);
            }
        }
        return estudiantesAcuario;
    }

    public List<Student> getOlderThanImperative(List<Student> students, int age){
        List<Student> estudiantesMayoresDe25 = new ArrayList<>();
        for (Student estudiante : students) {
            if (estudiante.getEdad() > age) {
                estudiantesMayoresDe25.add(estudiante);
            }
        }
        return estudiantesMayoresDe25;
    }
}
