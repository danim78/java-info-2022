import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horasT = new ArrayList<>();
        List<Integer> valorH = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de hs. trabajadas por día"); 
        for(int i = 1; i <= 5; i++){
            int x = scan.nextInt();
            horasT.add(x);
        }

        System.out.println("Ingrese el valor por hora trabajada"); 
        for(int i = 1; i <= 5; i++){
            int x = scan.nextInt();
            valorH.add(x);
        }
        scan.close();
        ArrayList<Integer> tParcial = new ArrayList<>();

        for(int i = 0; i < horasT.size(); i++){

            tParcial.add(horasT.get(i) * valorH.get(i));
        }
        System.out.println(tParcial);

        int pago = 0;
        for (Integer e : tParcial) {
            pago += e;        
        }

        System.out.println(String.format("Total Final: $ %s", pago));
    }
    
}
