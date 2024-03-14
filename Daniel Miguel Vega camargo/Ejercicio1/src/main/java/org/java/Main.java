package org.java;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

        //Programacion declarativa
        int contar = 0;
        for (int i: numeros) {
            if (i > 10) {
                contar++;
            }
        }
        System.out.println(contar);

        //Programacion funcional
        long count = numeros.stream()
                .filter(num -> num > 10)
                .count();

        System.out.println(count);


    }
}