package org.example;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    class PersonaObserver implements Observer {

        @Override
        public void onSubscribe(Disposable disposable) {

        }

        @Override
        public void onNext(Object o) {

        }

        @Override
        public void onError(Throwable throwable) {

        }

        @Override
        public void onComplete() {

        }
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Pérez", "123456789", 30, "Aries");
        PersonaObserver observer = new PersonaObserver();
        persona1.addObserver(observer);


    }
}