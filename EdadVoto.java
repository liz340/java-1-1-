import java.util.Scanner;

public class EdadVoto {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        System.out.println ("Ingresa tu edad");
        int edad = teclado.nextInt();

        if (edad >= 18) 
        {
            System.out.println("Puedes votar");

         } else {
           
            System.out.println("Necesitas al menos 18 para votar");

        }

        
    }
}
