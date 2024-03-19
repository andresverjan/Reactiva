package org.example;

import org.example.model.Persona;

import java.util.List;
import java.util.Objects;


public class Main {

    public static void main(String[] args) {
        Persona personas = new Persona();
        System.out.println(personas);
        declarativeMethod(personas.estudiantes());
    }

    private static void declarativeMethod(List<Persona> personas){
        Gson gson = new Gson();
        var acuarios = personas.stream()
                        .filter(persona -> Objects.equals(persona.getSigno(), "acuario"));
        System.out.println(gson.toJson(acuarios));
    }

}