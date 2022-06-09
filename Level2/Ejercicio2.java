import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese cinco números enteros");

        for (int i = 0; i < 5; i++){
           int elemento = scan.nextInt();
           lista.add(elemento);
        }

        System.out.println(String.format("La lista tiene %s elementos:", lista.size()));
        lista.forEach(System.out::println);

        System.out.println("Ingrese un número entero para añadir en la 1era. posición");
        int elemento = scan.nextInt();
        lista.add(0, elemento);

        System.out.println(String.format("Ahora lista tiene %s elementos:", lista.size()));
        lista.forEach(System.out::println);

        System.out.println("Ingrese un números entero para añadir en la última posición");
        int elemento1 = scan.nextInt();
        lista.add(lista.size(), elemento1);
        scan.close();

        System.out.println(String.format("Ahora lista tiene %s elementos:", lista.size()));
        lista.forEach(System.out::println);
    }
    
}
