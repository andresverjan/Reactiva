import java.util.ArrayList;
import java.util.List;

public class ImperativeForm {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

        List<Integer> numbersGreaterThan10 = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > 10) {
                numbersGreaterThan10.add(number);
            }
        }

        System.out.println("Numbers than greater to 10:");

        for (Integer number : numbersGreaterThan10) {
            System.out.println(number);
        }
    }

}
