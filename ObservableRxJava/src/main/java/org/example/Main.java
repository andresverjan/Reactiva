package org.example;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Main {
    public static void main(String[] args) {


        Observable<Integer> observable = Observable.range(1, 5);
        Observable<Integer> squaredObservable = observable.map(number -> number * number);

        observable.subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Subscribe Observable 1");
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("Llego un valor del Observable 1: " + integer);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Error");
            }

            @Override
            public void onComplete() {
                System.out.println("finalizo observable 1");
            }
        });

        squaredObservable.subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Suscripcion iniciada");
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("Siguiente valor: " + integer);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Error: " + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Todos los elementos han sido procesados");
            }
        });

    }
}