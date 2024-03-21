package Tarea2;

import lombok.Data;

@Data
public class Estudiante {
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private String signo;

    private EstudianteObserver observer;

    public Estudiante(String nombre, String apellido, String telefono, int edad, String signo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.signo = signo;
    }

    public void setObserver(EstudianteObserver observer) {
        this.observer = observer;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        notifyObserver("nombre", nombre);
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        notifyObserver("apellido", apellido);
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
        notifyObserver("telefono", telefono);
    }

    public void setEdad(int edad) {
        this.edad = edad;
        notifyObserver("edad", edad);
    }

    public void setSigno(String signo) {
        this.signo = signo;
        notifyObserver("signo", signo);
    }

    private void notifyObserver(String propertyName, Object propertyValue) {
        if (observer != null) {
            observer.notifyChange(propertyName, propertyValue);
        }
    }
}
