package Tarea2;

public class EstudianteObserver {
    private String lastNotification;

    public void notifyChange(String propertyName, Object propertyValue) {
        lastNotification = "Propiedad cambiada: " + propertyName + " - Nuevo valor: " + propertyValue;
        System.out.println(lastNotification);
    }

    public void printLastNotification() {
        if (lastNotification != null) {
            System.out.println(lastNotification);
        } else {
            System.out.println("No se recibieron notificaciones.");
        }
    }
}
