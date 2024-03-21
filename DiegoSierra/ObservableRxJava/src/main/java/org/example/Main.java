package org.example;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static class PersonaObserver implements Observer {

        @Override
        public void onSubscribe(Disposable disposable) {
            System.out.println("Se suscribe");
        }

        @Override
        public void onNext(Object objeto) {
            System.out.println("llego un valor del observable: " + objeto);
        }

        @Override
        public void onError(Throwable throwable) {
            System.out.println("error");
        }

        @Override
        public void onComplete() {
            System.out.println("finalizo el Observable 1");
        }
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Pérez", "123456789", 30, "Aries");
        PersonaObserver observerPersona = new PersonaObserver();


    }
}