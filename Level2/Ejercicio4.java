import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<>();

        alumnos.add("Jezabel");
        alumnos.add("Nahiara");
        alumnos.add("Lautaro");
        alumnos.add("Mía");
        alumnos.add("Narella");
        alumnos.add("Felipe");
        alumnos.add("Juan");
        alumnos.add("Valentina");
        alumnos.add("Alma");
        alumnos.add("Francisco");
        alumnos.add("Victoria");
        alumnos.add("Martino");

        System.out.println(String.format("Los estudiantes inscriptos son: %s",alumnos));

        List<String> curso1 = alumnos.subList(0, 4);
        List<String> curso2 = alumnos.subList(4, 8);
        List<String> curso3 = alumnos.subList(8, 12);

        System.out.println(String.format("Curso 1: formado por %s", curso1));
        System.out.println(String.format("Curso 2: formado por %s", curso2));
        System.out.println(String.format("Curso 3: formado por %s", curso3));
    }
    
}
