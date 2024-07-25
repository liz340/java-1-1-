import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int suposicion = 0;

        System.out.println("Adivina el numero entre 1 y 100");
        
        while (suposicion != numeroAleatorio) {
            System.out.print("Ingresa tu suposicion: ");
            suposicion = scanner.nextInt();

            if (suposicion < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (suposicion > numeroAleatorio) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("Felicidades Adivinaste el numero correcto.");
            }
        }

        scanner.close();
    }
}