package fibonacci;

public class RecursiveForm {

    public static void main(String[] args) {
        int number = 10;

        System.out.println(STR."The \{number} first terms of the Fibonacci series are:");

        for (int i = 0; i < number; i++) {
            int fib = fibonacci(i);

            if (fib % 2 == 0) {
                System.out.print(STR."\{fibonacci(i)} ");
            }

        }
    }

    public static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}


