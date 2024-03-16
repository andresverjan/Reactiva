package co.com.bamcolombia.ejercicio;

import java.util.List;

public class EjercicioUno {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

        //Solucion imperativa
        for (Integer numero: numeros)
        {
            if(numero>10){
                System.out.println("Numero mayor que 10: ".concat(numero.toString()));
            }
        }
        // Programacion Funcional.
       var count = numeros.stream().filter(numero-> numero>10).count();
        System.out.println("Cantidad de numeros mayores a 10: ".concat(String.valueOf(count)));



    }
}
