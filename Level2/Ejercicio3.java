import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {
        List<Integer> baraja = new ArrayList<>();
        
        for (int i = 2; i <= 10; i++){
            baraja.add(i);
        }
        
        System.out.println("Baraja en orden");
        System.out.println(baraja);

        System.out.println("Baraja en orden invertido");
        Collections.reverse(baraja);
        System.out.println(baraja);

        System.out.println("Baraja mezclada");
        Collections.shuffle(baraja);
        System.out.println(baraja);

    }
    
}
