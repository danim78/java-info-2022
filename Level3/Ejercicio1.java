import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
            palabras.add("Hola");
            palabras.add(null);
            palabras.add("Informatorio");
            palabras.add("");
        
        filtro(palabras);

    }
    public static void filtro(List<String> palabras) {
        List<String> resultadoNoNulosOVacios = palabras.stream()
                .filter(palabra -> palabra != null && !palabra.isBlank())
                .collect(Collectors.toList());

        System.out.println(resultadoNoNulosOVacios);
    }
    
}
