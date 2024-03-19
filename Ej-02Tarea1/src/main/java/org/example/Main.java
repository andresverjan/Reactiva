package org.example;

import org.example.model.Persona;
import java.util.List;
import java.util.Objects;


public class Main {

    public static void main(String[] args) {
        Persona personas = new Persona();
        System.out.println(personas);
        declarativeMethod(personas.estudiantes());
        imperativeMethod(personas.estudiantes());
    }

    private static void declarativeMethod(List<Persona> personas){
        System.out.println("METODO DECLARATIVO___________");
        System.out.println("Estudiantes Acuario:");
        personas.stream()
                .filter(persona -> Objects.equals(persona.getSigno(), "Acuario"))
                .map(Persona::getNombre)
                .forEach(System.out::println);
        System.out.println("Estudiantes mayores de 25 años:");
        personas.stream()
                .filter(persona -> persona.getEdad() > 25)
                .map(Persona::getNombre)
                .forEach(System.out::println);
    }

    private static void imperativeMethod(List<Persona> personas){
        System.out.println("METODO IMPERATIVO___________");
        System.out.println("Estudiantes Acuario:");
        for(int i=0; i < personas.size(); i++){
            if(Objects.equals(personas.get(i).getSigno(), "Acuario")){
                System.out.println(personas.get(i).getNombre());
            }
        }
        System.out.println("Estudiantes mayores de 25 años:");
        for(int i=0; i < personas.size(); i++){
            if(personas.get(i).getEdad() > 25){
                System.out.println(personas.get(i).getNombre());
            }
        }
    }

}