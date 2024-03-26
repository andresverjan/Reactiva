package org.example.model;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import java.time.LocalDate;

public class PersonaObservable {
        private Observable<String> nombre;
        private Observable<String> apellido;
        private Observable<String> telefono;
        private Observable<Integer> edad;
        private Observable<String> signo;
    public PersonaObservable(){

    }
    public PersonaObservable(Observable<String> nombre, Observable<String> apellido, Observable<String> telefono, Observable<Integer> edad, Observable<String> signo) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.telefono = telefono;
            this.edad = edad;
            this.signo = signo;
        }

        public Observable<String> getNombre() {
            return nombre;
        }

        public void setNombre(Observable<String> nombre) {
        nombre.subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                System.out.println("Se Modifico el nombre a " + s);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
            this.nombre = nombre;
        }

        public Observable<String> getApellido() {
            return apellido;
        }

        public void setApellido(Observable<String> apellido) {
        apellido.subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                System.out.println("Se Modifico el apellido a " + s);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
            this.apellido = apellido;
        }

        public Observable<String> getTelefono() {
            return telefono;
        }

        public void setTelefono(Observable<String> telefono) {
            telefono.subscribe(new Observer<String>() {
                @Override
                public void onSubscribe(Disposable d) {

                }

                @Override
                public void onNext(String s) {
                    System.out.println("Se Modifico el Telefono a " + s);
                }

                @Override
                public void onError(Throwable e) {

                }

                @Override
                public void onComplete() {

                }
            });
            this.telefono = telefono;
        }

        public Observable<Integer> getEdad() {
            return edad;
        }

        public void setEdad(Observable<Integer> edad) {
        edad.subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("Se Modifico  la edad a " + integer);
                System.out.println("Su fecha de nacimiento es " + LocalDate.now().minusYears(integer).toString());
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
            this.edad = edad;
        }

        public Observable<String> getSigno() {
            return signo;
        }

        public void setSigno(Observable<String> signo) {
        signo.subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                System.out.println("Se Modifico  el signo  a " + s);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
            this.signo = signo;
        }
}
