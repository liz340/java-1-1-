import java.util.Scanner;

public class CalcularFactorial {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese un numero");
        int num= teclado.nextInt();

        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
