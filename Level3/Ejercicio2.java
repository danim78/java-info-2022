import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> nros = List.of(1, 2, 3, 4, 5);
        
        numAlCuadrado(nros);     
    }
    
    public static void numAlCuadrado(List<Integer> nros) {
        List<Integer> numPot = nros.stream()
            .map(n -> n.intValue() * n.intValue())
            .collect(Collectors.toList());
        System.out.println(numPot);
    }
}