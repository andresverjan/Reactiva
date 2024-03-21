
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;


public class ObservableMain {

    public static void main(String[] args){
        Observable<Integer> observable = Observable.range(1,5);
        Observable<Integer> squaredObservable = observable.map(number -> number * number);

        observable.subscribe(
                new Observer<Integer>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable disposable) {
                        System.out.println("Subscribe to Observable 1");
                    }

                    @Override
                    public void onNext(@NonNull Integer integer) {
                        System.out.println("llego un valor del Observable 1 : " +  integer);
                    }

                    @Override
                    public void onError(@NonNull Throwable throwable) {
                        System.out.println("error");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("finalizo el Observable 1");
                    }
                }
        );

        squaredObservable.subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Suscripción iniciada");
            }

            @Override
            public void onNext(Integer value) {
                System.out.println("Siguiente valor: " + value);
            }

            @Override
            public void onError(Throwable e) {
                System.err.println("Error: " + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Todos los elementos han sido procesados");
            }
        });

    }
    
}
