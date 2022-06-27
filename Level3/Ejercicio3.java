import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl",
            "Wonder Woman", "brainiac");

        filtradoLetra(palabras);
        
    }

    private static void filtradoLetra(List<String> palabras) {
        List<String> incialB = palabras.stream()
            .filter(p -> Character.toUpperCase(p.charAt(0)) == 'B')
            .collect(Collectors.toList());
        
        System.out.println(incialB.size());
    }
    
}
