import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        System.out.println("Ingrese dos números enteros");

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        System.out.println(fizzBuzzFuncion(a, b));
    }

    public static List<String> fizzBuzzFuncion(int a, int b){

        List<String> resultado = new ArrayList<>();

        for(int i = a; i < b; i++){
            int m2 = i % 2;
            int m3 = i % 3;
            String e = "";

            if (m2 == 0 && m3 == 0){
                e = "FizzBuzz";
            }else if (m2 == 0 && m3 != 0){
                e = "Fizz";
            }else if (m2 != 0 && m3 == 0){
                e = "Buzz";
            }else {
                e = String.valueOf(i);
            }
            resultado.add(String.format("\"%s\"", e));
        }
        return resultado;
    }  
}