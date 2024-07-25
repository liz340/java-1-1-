import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = scanner.nextInt();

        int cantidadDigitos = String.valueOf(numero).length();

        System.out.println("El numero " + numero + " tiene " + cantidadDigitos + " digitos.");

        scanner.close();
    }
}