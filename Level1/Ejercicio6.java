import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int potencia = 1;
        for (int i = 1; i <= b; i++){
            potencia = potencia * a; 
        }
        System.out.println(String.format("%s elevado a %s = %s", a, b, potencia));
    }    
}
