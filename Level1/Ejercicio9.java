import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el texto o frase");
        String s = scan.nextLine();
        System.out.println("Ingrese el caracter a contar");
        char c = scan.next().charAt(0);
        scan.close();
        int contador = 0;
            for(int i = 0; i <= s.length()-1; i++){
                if (s.charAt(i) == c){
                    contador += 1;
                }
            }
        System.out.println(String.format("El caracter '%s' aparece %s veces en '%s'.", c, contador, s));             
    }
}
