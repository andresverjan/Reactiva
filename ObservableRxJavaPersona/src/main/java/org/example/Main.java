package org.example;


import org.example.model.Persona;
import org.example.model.PublishPersona;

public class Main {
    /*
    Vamos a modificar la clase Persona, creada anteriormente para usar el patron observable.
    De tal forma de que podamos crear un observer que se encargue de detectar los cambios
    que se hagan sobre cualquiera de las propiedades. Es decir, que el observer se debe suscribir
    al observable y cuando exista  un cambio en una propiedad del observable, se debe imprimir en
    consola el valor seteado.
    Bonus:
    al momento de hacer un setEdad, debe retornar cual es la fecha de nacimiento. en formato año mes dia.
    */
    public static void main(String[] args) {

        var persona = new Persona();
        persona.getPersonaObservable()
                .subscribe(
                        Main::printCambios,
                        error -> System.out.println("Error: " + error.getMessage())
                )
        ;
        persona.setNombre("Juan");
        persona.setNombre("Luis");
        persona.setApellido("Gonzalez");
        persona.setEdad(32);
        persona.setEdad(160);
        persona.setSigno("Geminis");
    }

    public static void printCambios(PublishPersona publishPersona){
        System.out.println("Campo: '" + publishPersona.campo() +
                "', valor anterior: '" + publishPersona.valorAnterior() +
                "', nuevo valor: '" + publishPersona.nuevoValor());
    }

}