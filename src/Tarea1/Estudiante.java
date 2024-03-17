package src.Tarea1;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/* reemplazao estas anotaciones por Data que tiene inmersas las 4 anotaciones(Getter Setter EqualsAndHashCode ToString  )
@Getter
@Setter*/

@Data
@AllArgsConstructor
public class Estudiante {


    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private String signo;

}
