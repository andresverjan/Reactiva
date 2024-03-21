package org.example;


import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", "Pérez", "123456789", 30, "Aries");

        persona1.publishSubject().subscribe(

                new Observer<Object>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable disposable) {
                        System.out.println("Subscribe to Observable 1");
                    }

                    @Override
                    public void onNext(@NonNull Object integer) {
                        System.out.println("Cambio "+ integer);
                    }

                    @Override
                    public void onError(@NonNull Throwable throwable) {
                        System.out.println("error");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("finalizo el Observable 1");
                    }
                });

                persona1.setNombre("Nelson");
    }
}
