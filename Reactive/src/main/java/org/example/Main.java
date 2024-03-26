package org.example;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import org.example.model.Persona;
import org.example.model.PersonaObservable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        personasObservables();
        personasObservable();
       ejercicioClase();
    }

    private static void personasObservable() {
        PersonaObservable personaObservable = new PersonaObservable();
        personaObservable.setNombre(Observable.create(emitter -> emitter.onNext("Holita")));
        personaObservable.setApellido(Observable.create(emitter -> emitter.onNext("Holita2")));
        personaObservable.setEdad(Observable.create(emitter -> emitter.onNext(12)));
    }

    private static void ejercicioClase() {
        Observable<Integer> integerObservable = Observable.range(1, 5);
        Observable<Integer> integerObservable1 = integerObservable.map(number -> number * number);
        integerObservable.subscribe(
                new Observer<Integer>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable disposable) {
                        System.out.println("Subscribe to Observable 1");
                    }

                    @Override
                    public void onNext(@NonNull Integer integer) {
                        System.out.println("llego un valor del Observable 1 : " + integer);
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
        integerObservable1.subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Suscripcion inicializada");
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("Siguiente valor" + integer);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Error " + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Todo fue completado");
            }
        });
    }

    private static void personasObservables() {
        Persona persona1 = new Persona("Juan", "Pérez", "123456789", 30, "Aries");
        Persona persona2 = new Persona("María", "Gómez", "987654321", 25, "Virgo");
        Persona persona3 = new Persona("Carlos", "Martínez", "555444333", 40, "Capricornio");
        Persona persona4 = new Persona("Laura", "Rodríguez", "111222333", 35, "Tauro");
        Persona persona5 = new Persona("Pedro", "Sánchez", "999888777", 28, "Leo");
        Persona persona6 = new Persona("Ana", "Fernández", "666777888", 22, "Acuario");
        Persona persona7 = new Persona("David", "López", "333222111", 45, "Cáncer");
        Persona persona8 = new Persona("Sofía", "Díaz", "777666555", 32, "Géminis");
        Persona persona9 = new Persona("Javier", "Hernández", "888999000", 27, "Escorpio");
        Persona persona10 = new Persona("Elena", "García", "112233445", 33, "Libra");
        Persona persona11 = new Persona("Pablo", "Muñoz", "554433221", 38, "Piscis");
        Persona persona12 = new Persona("Rosa", "Jiménez", "998877665", 29, "Sagitario");

        Observable<Persona> personaObservable =
                Observable.create(emitter -> {
                    emitter.onNext(persona1 );
                    emitter.onNext(persona2 );
                    emitter.onNext(persona3 );
                    emitter.onNext(persona4 );
                    emitter.onNext(persona5 );
                    emitter.onNext(persona6 );
                    emitter.onNext(persona7 );
                    emitter.onNext(persona8 );
                    emitter.onNext(persona9 );
                    emitter.onNext(persona10);
                    emitter.onNext(persona11);
                    emitter.onNext(persona12);
                });
        persona12.setEdad(12);
        personaObservable.
                distinctUntilChanged().
                doOnNext(persona -> System.out.println("Persona Cambiada " + persona)).subscribe();
        persona12.setApellido("HOLAHOLA");
    }
}