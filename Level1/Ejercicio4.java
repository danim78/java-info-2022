import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int a = scan.nextInt();
        scan.close();
        int factorial = 1;

        for (int i = a; i > 1; i--){
            factorial = factorial * i; 
        }
        System.out.println(String.format("El factorial de %s es: %s", a, factorial));
    }
    
}