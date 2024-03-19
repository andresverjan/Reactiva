import reactor.core.publisher.Flux;

public class Main {

    public static void main(String[] args) {
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();

        fibonacciGenerator.generate(0, 1)
                .take(10)
                .filter(n -> n % 2 == 0)
                .reduce(Long::sum)
                .subscribe(sum -> System.out.println("La suma de los números pares es: " + sum));


        public class FibonacciGenerator {

            public Flux<Long> generate(long a, long b) {
                return Flux.just(a).concatWith(generate(b, a + b));
            }
        }
    }
}