package com.bancolombia;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        primer();

        ejercicioFibonnaci();
    }

    private static void ejercicioFibonnaci() {
        var n = 10;
        List<Integer> fib = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            fib.add(fibbonacci(i));
        }
        System.out.println(fib);

        var result = fib.stream()
                .filter(numero -> numero % 2 == 0)  // Filtrar los números pares
                .reduce((a, b) -> a + b)            // Sumar los números pares
                .get();                             // Obtener el resultado

        System.out.println("Suma de los números pares: " + result);
    }

    private static int fibbonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibbonacci(n - 1) + fibbonacci(n - 2);
    }

    private static void primer() {
        List<Integer> numeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
        int counter = 0;

        for (int numero : numeros) {
            if (numero > 10) {
                counter++;
            }
        }

        System.out.println("Cantidad de números mayores a 10: " + counter);

        int counter2 = (int) numeros.stream().filter(numero -> numero > 10).count();
        System.out.println("Cantidad de números mayores a 10: " + counter2);
    }
}