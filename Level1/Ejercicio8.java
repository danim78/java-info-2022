import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese Nombre y Apellido");
        String nombre = scan.nextLine();
        System.out.println("Ingrese Edad");
        int edad = scan.nextInt();
        scan.nextLine(); //limpia el buffer de entrada
        System.out.println("Ingrese Dirección");
        String direccion = scan.nextLine();
        System.out.println("Ingrese Ciudad");
        String ciudad = scan.next();
        scan.close();

        System.out.println(String.format("%s - %s - %s - %s", ciudad, direccion, edad, nombre));
    }
    
}
