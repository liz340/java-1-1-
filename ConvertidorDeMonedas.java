package convertidordemonedas;

import java.util.Scanner;

public class ConvertidorDeMonedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Conversor de moneda mexicana");
        System.out.println("1.-Pesos Mexicanos a Dólares");
        System.out.println("2.-Pesos Mexicanos a Euros");
        System.out.println("3.-Pesos Mexicanos a Bath");
        System.out.println("4.-Pesos Mexicanos a Yen");
        System.out.println("5.-Pesos Mexicanos a Won");
        System.out.println("6.-Pesos Mexicanos a Dólar Australiano");
        System.out.println("7.-Pesos Mexicanos a Sol");
        System.out.println("8.-Pesos Mexicanos a Dólar Canadiense");
        System.out.println("9.-Pesos Mexicanos a Bolívar");
        System.out.println("10.-Pesos Mexicanos a Peso Argentino");
        System.out.println("Seleccione cualquier opción de la parte superior");
        
        int opcion = scanner.nextInt();
        double pesos;
        
        switch (opcion){
            case 1:
                System.out.print("Ingrese la cantidad en Pesos Mexicanos: ");
                pesos = scanner.nextDouble();
                double Dolares = pesos / 18.0;
                System.out.println("Cantidad en Dólares: " + Dolares);
                break;
            case 2:
                System.out.print("Ingrese la cantidad en Pesos Mexicanos: ");
                pesos = scanner.nextDouble();
                double Euros = pesos / 19.0;
                System.out.println("Cantidad en Euros: " + Euros);
                break;
            case 3:
                System.out.print("Ingrese la cantidad en Pesos Mexicanos: ");
                pesos = scanner.nextDouble();
                double Bath = pesos * 2.0;
                System.out.println("Cantidad en Bath" + Bath);
                break;
            case 4:
                System.out.print("Ingrese la cantidad en Pesos Mexicanos: ");
                pesos = scanner.nextDouble();
                double Yen = pesos * 9.0;
                System.out.println("Cantidad en Yen" + Yen);
                break;
            case 5:
                System.out.print("Ingrese la cantidad en Pesos Mexicanos: ");
                pesos = scanner.nextDouble();
                double Won = pesos * 77.0;
                System.out.println("Cantidad en Won" + Won);
                break;
            case 6:
                System.out.print("Ingrese la cantidad en Pesos Mexicanos: ");
                pesos = scanner.nextDouble();
                double DolarAustraliano = pesos / 12.0;
                System.out.println("Cantidad en Dólar Australiano" + DolarAustraliano);
                break;
            case 7:
                System.out.print("Ingrese la cantidad en Pesos Mexicanos: ");
                pesos = scanner.nextDouble();
                double Sol = pesos / 5.0;
                System.out.println("Cantidad en Sol" + Sol);
                break;
            case 8:
                System.out.print("Ingrese la cantidad en Pesos Mexicanos: ");
                pesos = scanner.nextDouble();
                double DolarCanadiense = pesos / 13.0;
                System.out.println("Cantidad en Dólar Canadiense" + DolarCanadiense);
                break;
            case 9:
                System.out.print("Ingrese la cantidad en Pesos Mexicanos: ");
                pesos = scanner.nextDouble();
                double Bolivar = pesos / 3.0;
                System.out.println("Cantidad en Bolívar" + Bolivar);
                break;
            case 10:
                System.out.print("Ingrese la cantidad en Pesos Mexicanos: ");
                pesos = scanner.nextDouble();
                double PesosArgentinos = pesos * 52.0;
                System.out.println("Cantidad en Pesos Argentinos" + PesosArgentinos);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
