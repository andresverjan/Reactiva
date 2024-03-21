package co.com.funcional;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Estudiante> estudiantes = new ArrayList<>();
//
//        estudiantes.add(new Estudiante("Juan", "Pérez", "123456789", 30, "Aries"));
//        estudiantes.add(new Estudiante("María", "Goméz", "987654321", 25, "Virgo"));
//        estudiantes.add(new Estudiante("Carlos", "Martínez", "555444333", 40, "Acuario"));
//        estudiantes.add(new Estudiante("Laura", "Rodríguez", "111222333", 35, "Tauro"));
//        estudiantes.add(new Estudiante("Pedro", "Sánchez", "999888777", 28, "Leo"));
//        estudiantes.add(new Estudiante("Ana", "Fernández", "666777888", 22, "Acuario"));
//        estudiantes.add(new Estudiante("David", "López", "333222111", 45, "Cáncer"));
//        estudiantes.add(new Estudiante("Sofía", "Díaz", "777666555", 32, "Géminis"));
//        estudiantes.add(new Estudiante("Javier", "Hernandéz", "888999000", 27, "Escorpio"));
//        estudiantes.add(new Estudiante("Elena", "García", "112233445", 33, "Libra"));
//        estudiantes.add(new Estudiante("Pablo", "Muñoz", "554433221", 38, "Piscis"));
//        estudiantes.add(new Estudiante("Rosa", "Jiménez", "998877665", 29, "Sagitario"));
        //ObtenerDatos.buscarSignoAcuario(estudiantes);
        //ObtenerDatos.buscarAcuarioImp(estudiantes);
        //ObtenerDatos.buscarmayoresDec(estudiantes);
        //ObtenerDatos.buscarMayoresImp(estudiantes);

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