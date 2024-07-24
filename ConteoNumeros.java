import java.util.Scanner;

public class ConteoNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de numeros que deseas ingresar: ");
        int cantidad = teclado.nextInt();

        int mayoresCero = 0;
        int menoresCero = 0;
        int igualesCero = 0;

        for (int i = 0; i < cantidad; i++) {
            
            System.out.print("Ingresa un numero: ");
            double numero = teclado.nextDouble();
            
            if (numero > 0) {
                mayoresCero++;
            } else if (numero < 0) {
                menoresCero++;
            } else {
                igualesCero++;
            }
        }

        System.out.println("Numeros mayores que 0: " + mayoresCero);
        System.out.println("Numeros menores que 0: " + menoresCero);
        System.out.println("Numeros iguales a 0: " + igualesCero);
    }
}
