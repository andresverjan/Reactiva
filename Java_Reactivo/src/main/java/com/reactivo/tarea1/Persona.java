package co.com.bamcolombia.tarea1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Persona {
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private String signo;

}
