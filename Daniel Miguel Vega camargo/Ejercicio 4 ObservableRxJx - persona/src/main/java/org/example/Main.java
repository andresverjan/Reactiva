package org.example;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Forma 1
        Observer<String> nombreObserver = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
            }

            @Override
            public void onNext(String nombre) {
                System.out.println("Nombre cambiado: " + nombre);
            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onComplete() {
            }
        };
       PersonaObservable persona = new PersonaObservable("Juan", "Pérez", "123456789", 30, "Aries", nombreObserver);
        persona.setNombre("Pedro");


    }
}