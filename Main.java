import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>numeros = List.of(18,6,4,15,55,78,12,9,8);
        int contador=0;

        for(int num: numeros){
            if(num>10){
                contador++;
                System.out.println(num);
            }
        }
        System.out.println("\n");
        System.out.println("Los numeros mayores a 10 son en tota: "+contador);
    }
}
