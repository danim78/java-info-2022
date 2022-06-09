import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;

        System.out.println(String.format("%s + %s = %s", a, b, suma));
        System.out.println(String.format("%s - %s = %s", a, b, resta));
        System.out.println(String.format("%s * %s = %s", a, b, multiplicacion));
        System.out.println(String.format("%s / %s = %s", a, b, division));
        System.out.println(String.format("%s %% %s = %s", a, b, modulo));

    }
    
}
