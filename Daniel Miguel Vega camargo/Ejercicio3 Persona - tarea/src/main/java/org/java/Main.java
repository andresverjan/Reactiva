package org.java;

import java.util.List;


import static org.java.PersonaUtils.*;

public class Main {

    public static void main(String[] args) {
        List<Persona> personas = inicializarPersonas();
        System.out.println("--- Total personas con signo especificado: " + filtrarPorSignoImperativo(personas, "Acuario").size() + " ---");
        System.out.println("Declarativo: " + filtrarPorSignoDeclarativo(personas, "Acuario"));
        System.out.println("Imperativo: " + filtrarPorSignoImperativo(personas, "Acuario") + '\n');
        System.out.println("--- Total personas con edad mayor a la especificada: " + filtrarPorEdadImperativo(personas, 25).size() + " ---");
        System.out.println("Declarativo: " + filtrarPorEdadDeclarativo(personas, 25));
        System.out.println("Imperativo: " + filtrarPorEdadImperativo(personas, 25));
    }

}
