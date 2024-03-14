package org.java;

import java.util.ArrayList;
import java.util.List;

public class Main {


    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    static int suma(List<Integer> numeros) {
        return numeros.stream()
                .filter(num -> esPar(num)) //filtra los números pares
                .reduce(0, Integer::sum); //suma los valores pares.
    }

    public static void main(String[] args) {
        List<Integer> numerosFibonacci = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int valor = fibonacci(i);
            numerosFibonacci.add(valor);
        }
        System.out.println(numerosFibonacci);
        System.out.println(suma(numerosFibonacci));

    }

}
