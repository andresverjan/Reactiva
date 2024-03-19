package org.example;

import java.util.List;

public class Ejercicio_Functional {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
        long contador = numeros.stream()
                .filter(n ->  n > 10)
                .count();
        System.out.println("Total de numeros mayores a 10 son: " + contador);
    }
}
