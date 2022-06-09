import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        List<String> ciudades = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese sus 3 ciudades argentinas favoritas");
        String city1 = scan.nextLine();
        String city2 = scan.nextLine();
        String city3 = scan.nextLine();
        scan.close();
        ciudades.add(city1);
        ciudades.add(city2);
        ciudades.add(city3);

        for(int i = 0; i < ciudades.size(); i++){
            System.out.println(String.format("#%s - %s", i+1, ciudades.get(i)));
        }
    }
}
