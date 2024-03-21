package Estudiantes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private String signo;
}
