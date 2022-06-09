import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String s = scan.next();
        scan.close();
        char c = ' ';
        String resultado = "";

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                c = (char)(s.charAt(i) - 32);
            }
            else {
                c = (char)(s.charAt(i));
            }

            resultado += c;
        }    
        System.out.println(resultado);    
    }
}
