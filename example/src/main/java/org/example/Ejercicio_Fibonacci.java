package org.example;

public class Ejercicio_Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        long sum = sumEvenFibonacci(n);
        System.out.println("La suma de los números pares es: " + sum);
    }

    public static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n -2);
        }
    }

    public static int sumEvenFibonacci(int n) {
        int sum = 0;
        for (int i = 0;i <=n;i++) {
            int fib = fibonacci(i);
            if (fib % 2 == 0) {
                sum += fib;
            }
        }
        return sum;
    }
}
