import java.util.List;

public class FunctionalForm {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

        System.out.println("Numbers than greater to 10: ");
        numbers.stream()
                .filter(number -> number > 10)
                .forEach(System.out::println);
    }
}
