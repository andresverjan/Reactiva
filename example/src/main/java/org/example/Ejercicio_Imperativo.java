package org.example;

import java.util.List;

public class Ejercicio_Imperativo {
    public static void main(String[] args) {
        int contador = 0;
        List<Integer> numeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
        for (Integer numero: numeros) {
            if (numero > 10) {
                contador++;
            }
        }
        System.out.println("Total de numeros mayores a 10 son: " + contador);

    }
}
