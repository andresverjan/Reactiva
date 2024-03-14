package fibonacci;

import java.util.stream.IntStream;

public class Fibonacci {

    public static void main(String[] args) {
        int number = 10;

        System.out.println(STR."The \{number} first terms of the Fibonacci series are:");
        fibonacciStream(number)
                .filter(Fibonacci::isPar)
                .forEach(System.out::println);
    }

    public static IntStream fibonacciStream(int n) {
        return IntStream.range(0, n)
                .map(Fibonacci::fibonacci);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static boolean isPar(int n) {
        return n % 2 == 0;
    }
}


