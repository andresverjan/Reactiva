import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
        List<Integer> numerosFibo = new ArrayList<>();
        metodoInteractivo(numeros);
        metodoFuncional(numeros);
        Integer variableFibo = 10;
        for (int i = 0; i < variableFibo; i++) {
            numerosFibo.add(fibonacci(i));
        }
        System.out.println("La suma de los números pares en fibonacci es " + numerosFibo.stream().filter(d-> d% 2 ==0).
                reduce((a,b) -> a+b).get());
    }

    public static void metodoInteractivo(List<Integer> numeros) {
        Integer count = 0;
        List<Integer> integers = new ArrayList<>();
        for (Integer integer : numeros) {
            if (integer > 10) {
                integers.add(integer);
                count = count + 1;
            }
        }
        System.out.println("MAYORES" + count + " y son " + integers);
    }

    public static void metodoFuncional(List<Integer> numeros) {
        System.out.println("MAYORES CON FILTER " + numeros.stream().filter(d -> d > 10).count());
    }

    public static Integer fibonacci(Integer numero) {
        if (numero == 0 || numero == 1) {
            return numero;
        } else {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }
}