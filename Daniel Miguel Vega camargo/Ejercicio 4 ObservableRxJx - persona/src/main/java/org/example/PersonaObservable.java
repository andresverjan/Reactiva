package org.example;

import io.reactivex.Observable;
import io.reactivex.Observer;
import lombok.AllArgsConstructor;
import lombok.Getter; 

@Getter
@AllArgsConstructor
public class PersonaObservable {
    private String nombre;

    private String apellido;
    private String telefono;
    private int edad;
    private String signo;
    private Observer<String> nombreObserver;
    private Observable<String> nombreObservable;


    public PersonaObservable(String nombre, String apellido, String telefono, int edad, String signo, Observer<String> nombreObserver) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.signo = signo;
        this.nombreObserver = nombreObserver;
        this.nombreObservable = Observable.just(nombre);
        nombreObservable.subscribe(nombreObserver);
    }

    public void addObserverToNombre(Observer<String> observer) {
        nombreObserver = observer;
        observer.onNext(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        nombreObserver.onNext(nombre);
        ;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", signo='" + signo + '\'' +
                "}\n";
    }
}
