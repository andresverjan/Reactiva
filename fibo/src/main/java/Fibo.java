import java.util.ArrayList;
import java.util.List;

public class Fibo {


    public static void main(String[] args) {
        List<Integer> fi = new ArrayList<>();
        fibo(1, 1, fi);

        System.out.println("////");
        fi.forEach(System.out::println);

    }


    private static void fibo(int a, int b, List<Integer> fi) {
        if (b < 100) {
            System.out.println(a);
            if (a % 2 == 0) {
                fi.add(a);
            }
            fibo(b, a + b, fi);
        }

    }

}
