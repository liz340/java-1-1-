import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char letra;
    do {
      System.out.print("Ingrese una letra: ");
      letra = scanner.next().charAt(0);
      if (letra == ' ') {
        break;
      }
      if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
        System.out.println("La letra es una vocal");
      } else {
        System.out.println("La letra es una consonante");
      }
    } while (true);
    scanner.close();
  }
}
