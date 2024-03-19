package org.example;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Main {
    public static void main(String[] args) {

        Observable<Integer> observable = Observable.range(1,5);
        Observable<Integer> squareObservable = observable.map(number ->number * number);

        observable.subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Suscripción observable 1");
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("llegó el valor del Observable 1: " + integer);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Error: "+ e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Todos los elementos han sido procesados");
            }
        });
        squareObservable.subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Suscripción iniciada");
            }

            @Override
            public void onNext(Integer value) {
                System.out.println("Siguiente valor: "+ value);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Error: "+ e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Todos los elementos han sido procesados");
            }
        });
    }
}