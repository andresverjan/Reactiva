package ejercicios;

import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

        //  números mayores a 10 contador inicio 0
        int cantidadMayoresA10 = 0;

        // Ciclo "for" para iterar sobre la lista de números
        for (int numero : numeros) {
            if (numero > 10) {
                cantidadMayoresA10++;
            }
        }

        List<Integer> numeros2 = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

        // Contar cuántos números son mayores a 10 de manera declarativa
        long cantidadMayores10 = numeros2.stream().filter(numero2 -> numero2 > 10).count();
        System.out.println("Cantidad de números mayores a 10: " + cantidadMayores10);
    }


}
