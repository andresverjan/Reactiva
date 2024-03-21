package org.example;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.example.model.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Luis");
        persona.setNombre("Jose");
        persona.subscribeNombre().subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                System.out.println("Subscribe Nombre");
            }

            @Override
            public void onNext(String nombre) {
                System.out.println("Llego un valor del nombre: " + nombre);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error: "+ throwable.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("finalizo nombre");
            }
        });
    }
}