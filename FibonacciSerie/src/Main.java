import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Obtener la serie de fibonacci, y sacar el resultado de los numeros pares haciendo uso de  recursividad.
    */
    public static void main(String[] args) {
        var profundidad = 10;

        List<Integer> serie = fibonacci(profundidad);
        serie.forEach(System.out::println);
        serie.stream()
                .filter(n -> n % 2 == 0)
                .reduce((a, b) -> a + b)
                .ifPresent(resultado -> System.out.println("Resultado: " + resultado));
    }

    public static ArrayList<Integer> fibonacci(int n) {
        if (n == 0) {
            return new java.util.ArrayList<>(List.of(0));
        }
        if (n == 1) {
            return new java.util.ArrayList<>(List.of(0, 1));
        }
        var serie = fibonacci(n - 1);
        serie.add(serie.get(serie.size() - 1) + serie.get(serie.size() - 2));
        return serie;
    }
}