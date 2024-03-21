package com.bancolombia;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        primerEjemplo();

        Persona persona = new Persona("Juan", "Perez", "1234567", 25, "Aries");
        persona.getEvents().subscribe(
                new Observer<List<Object>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println("Suscripción iniciada: "+ persona);
                    }

                    @Override
                    public void onNext(List<Object> value) {
                        System.out.println("El campo " + value.get(0) + " ha sido actualizado: " + value.get(1));
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

        persona.setNombre("Pedro");
        persona.setApellido("Ramirez");
        persona.setEdad(30);
        persona.setSigno("Tauro");
        persona.setTelefono("7654321");
    }

    private static void primerEjemplo() {
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