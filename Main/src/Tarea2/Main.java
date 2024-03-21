package Tarea2;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Gabriel","Jaime","3128164926",37,"Tauro");
        EstudianteObserver estudianteObserver = new EstudianteObserver();

        estudiante.setObserver(estudianteObserver);

        // Modificaciones en las propiedades del estudiante con notificaciones
        estudiante.setEdad(21);
        estudiante.setSigno("Tauro");

        estudiante.setNombre("Hola Mundo");
        estudiante.setEdad(55);

        // Quitamos el observer para que ya no reciba notificaciones
        estudiante.setObserver(null);

        // Modificaciones en las propiedades del estudiante sin notificaciones
        estudiante.setNombre("Maria");
        estudiante.setApellido("Lopez");

        // Al finalizar, imprimimos las últimas notificaciones recibidas por el observer
        System.out.println("Últimas notificaciones del observer:");
        estudianteObserver.printLastNotification();
    }
}
