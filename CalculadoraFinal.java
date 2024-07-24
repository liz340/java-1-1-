import java.util.Scanner;

public class CalculadoraFinal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la calificacion de los parciales (0-100): ");
        double parciales = teclado.nextDouble();

        System.out.print("Ingresa la calificacion del proyecto (0-100): ");
        double proyecto = teclado.nextDouble();

        System.out.print("Ingresa la calificacion del examen final (0-100): ");
        double examenFinal = teclado.nextDouble();

        if (parciales < 0 || parciales > 100 || proyecto < 0 || proyecto > 100 || examenFinal < 0 || examenFinal > 100) {
            System.out.println("Las calificaciones deben estar entre 0 y 100. Intentalo de nuevo.");
            return;
        }

        double notaFinal = 0.4 * parciales + 0.3 * proyecto + 0.3 * examenFinal;

        System.out.printf("La nota final del estudiante es: %.2f%n", notaFinal);

    }
}