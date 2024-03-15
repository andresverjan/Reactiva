import java.util.ArrayList;
import java.util.List;

public class ListOperations {

    public static void main(String[] args){
        List<Integer> numeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

        int result = ListCounter(numeros);

        System.out.print("hay " + result + " numeros menores que 10");
    }

    private static int ListCounter(List<Integer> numbers){
        int count = 0;
        for (int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) < 10){
                count++;
            }
        }
        return count;
    }

}