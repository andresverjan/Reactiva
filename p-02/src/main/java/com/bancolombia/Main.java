package com.bancolombia;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Main {
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.range(1, 5);
        Observable<Integer> squaredObservable = observable.map(number -> number * number);

        observable.subscribe(
                new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {
                        System.out.println("Subscribe to Observable 1");
                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println("Llegó un valor del obs1: " + integer);
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        System.out.println("Error en obs1: " + throwable);
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("obs1 completado");
                    }
                }
        );

        System.out.println("intermedio");
        squaredObservable.subscribe(
                new Observer<Integer>() {
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