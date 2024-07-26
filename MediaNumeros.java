import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int conteo = 0;
    double suma = 0;
    double numero;

    do {
      System.out.print("Ingrese un número positivo: ");
      numero = scanner.nextDouble();

      if (numero > 0) {
        conteo++;
        suma += numero;
      }
    } while (numero >= 0);

    if (conteo == 0) {
      System.out.println("No se ingresaron números positivos.");
    } else {
      double media = suma / conteo;
      System.out.println("La media de los números positivos es: " + media);
    }

    scanner.close();
  }
}
