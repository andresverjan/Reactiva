import java.util.ArrayList;
import java.util.List;

public class FibonacciOperations {

    public static void main(String[] args){

        List<Integer> fibList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            if(i%2 == 0){
                fibList.add(ListFibonacci(i));
            }
        }

        System.out.println("\nla lista de Fibonacci es: " + fibList);

    }

    private static int ListFibonacci(int number){
        if(number <= 1) {
            return number;
        }
        return ListFibonacci(number-1) + ListFibonacci(number-2);
    }
}
