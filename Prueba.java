import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el largo del rectángulo: ");
        double largo = teclado.nextDouble();

        System.out.print("Ingrese el ancho del rectángulo: ");
        double ancho = teclado.nextDouble();

        double area = largo * ancho;

        System.out.println("Área del rectángulo: " + area);
    }
}