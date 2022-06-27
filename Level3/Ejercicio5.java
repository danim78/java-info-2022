import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
            new Alumno("Simpson", "Homero", "1960-04-11"),
            new Alumno("Bonneto", "Jorge", "1960-04-11"),
            new Alumno("Del Alamo", "Gonzalo", "1960-04-11"),
            new Alumno("Rometto", "Walter", "1960-04-11"),
            new Alumno("Michel", "Nelson", "1960-04-11")
            );

        Map<String, Integer> alumnoEdad = new HashMap<>();
        
        alumno_Edad(alumnos, alumnoEdad);

        System.out.println(alumnoEdad);
    }

    private static void alumno_Edad(List<Alumno> alumnos, Map<String, Integer> alumnoEdad) {
        for( Alumno alumno : alumnos){
            alumnoEdad.put(alumno.getApYNom(), alumno.getEdad());
        }
    }
    
}

class Alumno {
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    
    public Alumno(String apellido, String nombre, String fechaNacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
    }

    public String getApYNom() {
        return (this.apellido + " " + this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        return edad.getYears();
    }

}