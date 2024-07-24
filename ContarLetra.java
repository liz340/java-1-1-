import java.util.Scanner;

public class ContarLetra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = teclado.nextLine();

        int contador = 0;
        int posicion = 0;

        while (posicion < palabra.length()) {
            if (palabra.charAt(posicion) == 'a' || palabra.charAt(posicion) == 'A') {
                contador++;
            }
            posicion++;
        }

        System.out.println("La letra 'a' aparece " + contador + " veces en la palabra.");
    }
}