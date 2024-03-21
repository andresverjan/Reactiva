package org.example.model;

import io.reactivex.Observable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Persona {
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private String signo;

    public Observable<String> subscribeNombre() {
        return Observable.just(nombre);
    }

    public Observable<String> subscribeApellido() {
        return Observable.just(apellido);
    }

    public Observable<String> subscribeTelefono() {
        return Observable.just(telefono);
    }

    public Observable<Integer> subscribeEdad() {
        return Observable.just(edad);
    }

    public Observable<String> subscribeSigno() {
        return Observable.just(signo);
    }

}
