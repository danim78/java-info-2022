import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {

    public static void main(String[] args) {

        Set<Empleado> empleados = new HashSet<>();

        empleados.add(new Empleado("Jorge Bonneto", 33333333, 107, 2800));
        empleados.add(new Empleado("Gonzalo del Alamo", 22222222, 115, 2800));
        empleados.add(new Empleado("Walter Rometto", 11111111, 218, 3600));

        Map<Integer, Integer> sueldos = new HashMap<>();

        for (Empleado e : empleados) {
            sueldos.put(e.dni, (e.hsTrabajadas*e.valorPorHora));            
        }

        System.out.println(sueldos);   
    }  
}

class Empleado {
    public String nomAp;
    public int dni;
    public int hsTrabajadas;
    public int valorPorHora;

    public Empleado(String nomAp, int dni, int hsTrabajadas, int valorPorHora) {
        this.nomAp = nomAp;
        this.dni = dni;
        this.hsTrabajadas = hsTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return "Empleado [Nombre y Apellido=" + nomAp + ", DNI=" + dni + 
                ", Horas trabajadas=" + hsTrabajadas + ", Valor por hora=" + valorPorHora + "]";
    }
}