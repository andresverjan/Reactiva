import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
        int contador = 0;

        for (int num : numeros) {
            if (num > 10) {
                contador++;
                System.out.println(num);
            }
        }
        System.out.println("\n");
        System.out.println("Los numeros mayores a 10 son en tota: " + contador);


        long count = numeros.stream()
                .filter(num -> num > 10)
                .count();
        System.out.println(count);
    }

    calcular(10);

}
 public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void calcular(int n) {
        System.out.println("los primeros " + n + "de la serie fibonacci son: ");
        for (int i = 0; i < n; i++) {
            if (fibonacci(i) % 2 == 0) {
                System.out.println(fibonacci(i) + " ");
            }
        }
    }
