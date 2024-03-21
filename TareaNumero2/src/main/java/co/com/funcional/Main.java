package co.com.funcional;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Rosa", "Jiménez", "998877665", 29, "Sagitario");

        System.out.println("*".repeat(120));
        System.out.println("Estudiante sin cambios: "+ estudiante);
        System.out.println("*".repeat(120));
        estudiante.setEdad(35);
        estudiante.setNombre("Camila");
        estudiante.subscribe(new Observer<Estudiante>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                System.out.println("Observer suscrito a cambios en el estudiante");
            }

            @Override
            public void onNext(@NonNull Estudiante estudiante) {
                System.out.print("Se dectectó un cambio:");
                System.out.println(estudiante);
                System.out.println("*".repeat(120));
            }

            @Override
            public void onError(@NonNull Throwable e) {
                System.err.println("Error en el observer: " + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Observer completo");
            }
        });



    }
}