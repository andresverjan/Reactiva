package co.com.funcional;


import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class Main {
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.range(1, 5);

        Observable<Integer> squaredObservable = observable.map(number -> number * number);

        squaredObservable.subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                System.out.println("subscripción iniciada");
            }

            @Override
            public void onNext(@NonNull Integer value) {
                System.out.println("Siguiente valor: " + value);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                System.err.println("Error: " + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Todos los elementos han sido procesados");
            }
        });

        observable.subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                System.out.println("Observable 1");
            }

            @Override
            public void onNext(@NonNull Integer value) {
                System.out.println("Llegó un valor del observable 1 " + value);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                System.err.println("Error");
            }

            @Override
            public void onComplete() {
                System.out.println("Finaliza el observable");
            }
        });
    }
}