package com.reactivo.tarea1;

import java.util.ArrayList;
import java.util.List;
import co.com.bamcolombia.tarea1.Persona;

public class Main {
    public static List<Persona> obtenerPersonas(){
        List<Persona> personas = List.of(
                new Persona("Juan", "Pérez", "123456789", 30, "Aries"),
                new Persona("María", "Gómez", "987654321", 25, "Virgo"),
                new Persona("Carlos", "Martínez", "555444333", 40, "Capricornio"),
                new Persona("Laura", "Rodríguez", "111222333", 35, "Tauro"),
                new Persona("Pedro", "Sánchez", "999888777", 28, "Leo"),
                new Persona("Ana", "Fernández", "666777888", 22, "Acuario"),
                new Persona("David", "López", "333222111", 45, "Cáncer"),
                new Persona("Sofía", "Díaz", "777666555", 32, "Géminis"),
                new Persona("Javier", "Hernández", "888999000", 27, "Escorpio"),
                new Persona("Elena", "García", "112233445", 33, "Libra"),
                new Persona("Pablo", "Muñoz", "554433221", 38, "Piscis"),
                new Persona("Rosa", "Jiménez", "998877665", 29, "Sagitario")
        );

        return personas;
    }

    public static void ipersonasdeSigno(List<Persona> personas,String signo){

        for (Persona persona: personas) {
            if (persona.getSigno().equals(signo)){
             System.out.println("La persona ".concat(persona.getNombre()+" "+persona.getApellido()).concat(" es de signo "+signo));
            }
        }
    }

    public static  void ipersonasMayores(List<Persona> personas,Integer edad){
        for (Persona persona : personas) {
            if (persona.getEdad()> edad){
                System.out.println("La persona "
                        .concat(persona.getNombre()+" "+persona.getApellido())+" tiene la edad de: "
                        .concat(String.valueOf(persona.getEdad())));
            }
        }
    }

    public static void fpersonasdeSigno(List<Persona> personas,String signo){
        personas.stream().filter(persona->{
            return persona.getSigno().equals(signo);
        }).forEach(System.out::println);
    }

    public static  void fpersonasMayores(List<Persona> personas,Integer edad){
      personas.stream().filter(persona->{
          return persona.getEdad() > edad;
      }).forEach(System.out::println);
    }


    public static void main(String[] args) {
            List<Persona> copiaPersoanas = obtenerPersonas();
            String signo ="Acuario";

            //Programcion Funcional
            System.out.println("----Funcional----");
            System.out.println("--Punto 1");
            fpersonasdeSigno(copiaPersoanas,signo);
            System.out.println("--Punto 2");
            fpersonasMayores(copiaPersoanas,25);

            //Programacion Imperativa
            System.out.println("----Imperativa----");
            System.out.println("--Punto 3");
            ipersonasdeSigno(copiaPersoanas,signo);
            System.out.println("--Punto 4");
            ipersonasMayores(copiaPersoanas,25);


    }
}
