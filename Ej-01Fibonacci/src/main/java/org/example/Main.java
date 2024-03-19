package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("STARTING......");
        List<Integer> list = new ArrayList<>();
        fibonacciRecursiveFunctions(list, 0,0,1);
    }

    private static void fibonacciRecursiveFunctions(List<Integer> list, Integer i, Integer num1, Integer num2) {
        list.add(i, num1);
        if (num1 % 2 == 0) {
            System.out.print(num1 + " ");
        } else {
            System.out.print("");
        }
        if (i > 10){
            var sum = list.stream()
                    .filter(n -> n % 2 == 0)
                            .reduce((a,b) -> a+b).get();
            System.out.println("\nLa suma de los números pares es: " + sum);
            System.out.println("......FINISHED");
        }
        else {
            int newNum2 = num1 + num2;
            fibonacciRecursiveFunctions(list,i +1, num2, newNum2);
        }
    }

}