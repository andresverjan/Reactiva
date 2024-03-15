package src;
import java.util.Scanner;
public class Ejercicio2 {

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void imprimirFibonacciHasta(int n) {
        int dato;
        System.out.print("Serie de Fibonacci pares hasta el término " + n + ": ");
        for (int i = 0; i <= n; i++) {
            dato=fibonacci(i);
            if (dato % 2 == 0) {
            System.out.print(dato + " ");}
        }
        System.out.println();
    }

    public static <integer> int sumaParesFibonacci(int n) {
        int suma=0 ;

        for (int i = 0; ; i++) {
            int fib = fibonacci(i);
            if (i > n) {
                break;
            }
            if (fib % 2 == 0) {
                suma += fib;

            }
        }
        return suma;
    }

    public static void main(String[] args) {

      //  int n = 5; // Prueba con los primeros 10 términos de la serie de Fibonacci
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese un número entero de terminos de la serie Fibonacci: ");
        int n = scanner.nextInt();
        imprimirFibonacciHasta(n);

        System.out.println("\nLa suma de los números pares en la serie de Fibonacci hasta el término " + n + " es: " + sumaParesFibonacci(n));
    }
}







