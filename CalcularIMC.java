
import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Su IMC es de :"+ imc);
        System.out.printf(" kilogramos");
        scanner.close();
    }
}