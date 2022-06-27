import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> listado = List.of(1, 2, 4, 4, 4);

        listaFactorial(listado);
    }

    private static void listaFactorial(List<Integer> listado) {
        List<Integer> factoriales = listado.stream().distinct()
        .map(e -> factorial(e))
        .collect(Collectors.toList());
        System.out.println(factoriales);
    }

    private static int factorial(int x) {
        int factorial = 1;
        for (int i = x; i > 1; i--){
            factorial = factorial * i;
        }
        return factorial;
    }
    
}
