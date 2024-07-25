import java.util.Scanner;

public class ConvertirTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Elige la conversion:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
                break;
            }
            case 2 -> {
                double kelvin = celsius + 273.15;
                System.out.println("La temperatura en Kelvin es: " + kelvin);
                break;
            }
            default -> System.out.println("Opcion invalida");
        }

        scanner.close();
    }
}