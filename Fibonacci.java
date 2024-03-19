import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {

    }

    public Integer fibbonacci_sum_pares(){
        int limit = 4000000; // Límite superior para la suma de números pares

        int sum = Stream.iterate(new int[]{1, 2}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .mapToInt(fib -> fib[1]) // Mapear al segundo elemento de cada par
                .takeWhile(n -> n <= limit) // Tomar elementos menores o iguales que el límite
                .filter(n -> n % 2 == 0) // Filtrar los números pares
                .sum(); // Sumar los números
        return (sum);
    }
}
