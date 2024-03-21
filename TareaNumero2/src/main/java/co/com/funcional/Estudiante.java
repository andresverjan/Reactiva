package co.com.funcional;

import io.reactivex.Observable;
import io.reactivex.Observer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Estudiante extends Observable<Estudiante> {
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private String signo;


    @Override
    protected void subscribeActual(Observer<? super Estudiante> observer) {
        observer.onNext(this);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                ", signo='" + signo + '\'' +
                '}';
    }
}
