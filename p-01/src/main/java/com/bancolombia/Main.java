package com.bancolombia;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
        int counter = 0;

        for(int numero : numeros) {
            if(numero > 10){
                counter++;
            }
        }

        System.out.println("Cantidad de números mayores a 10: " + counter);

        int counter2 = (int) numeros.stream().filter(numero -> numero > 10).count();
        System.out.println("Cantidad de números mayores a 10: " + counter2);
    }
}