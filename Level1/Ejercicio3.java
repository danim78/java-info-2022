import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int a = scan.nextInt();
        scan.close();

        List<Integer> lista = new ArrayList<>();

        for (int i = 1; i <= a; i++){
            lista.add(i);
            for (int j = 0; j < lista.size(); j++){
                System.out.print(lista.get(j) + " ");
            }
            System.out.println("");
        }
    }
    
}
