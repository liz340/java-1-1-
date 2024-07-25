import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer numero: ");
        double num3 = scanner.nextDouble();

        double promedio = (num1 + num2 + num3) / 3;

        System.out.println("El promedio de los tres numeros es: " + promedio);

        scanner.close();
    }
}