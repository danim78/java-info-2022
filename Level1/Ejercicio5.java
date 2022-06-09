import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int producto = 0;
        for (int i = 1; i <= b; i++){
            producto = producto + a; 
        }
        System.out.println(String.format("%s x %s = %s", a, b, producto));
    }
    
}
