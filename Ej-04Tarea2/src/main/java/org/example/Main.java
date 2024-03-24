package org.example;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.example.model.Persona;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Persona> estudiantes = Persona.estudiantes();


        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {}
            @Override
            public void onNext(String persona) {
                System.out.println("-------> ACTUALIZACIÓN:");
                System.out.println("Hubo un cambio en los datos de un estudiante. La información actualizada es la siguiente:");
                System.out.println(persona);
            }
            @Override
            public void onError(Throwable e) {}
            @Override
            public void onComplete() {}
        };

        Observable.fromIterable(estudiantes)
                .subscribe(estudiante -> estudiante.addObserver(observer));

        estudiantes.get(0).setApellido("LastNameChanged");
        estudiantes.get(1).setNombre("NameChanged");
        estudiantes.get(2).setEdad(100);
        estudiantes.get(3).setSigno("ZodiacalSignChanged");
        estudiantes.get(4).setTelefono("PhoneNumberChanged");
    }
}