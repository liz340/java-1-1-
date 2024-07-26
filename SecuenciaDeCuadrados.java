package com.mycompany.secuenciadecuadrados;

import java.util.Scanner;

public class SecuenciaDeCuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero positivo: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("Se callo el sistema piquele a run plis.");
            
        }
        
        int i = 1;
        do {
            System.out.println("El cuadrado de " + i + " es: " + (i * i));
            i++;
        } while (i <= numero);
        
        scanner.close();
    }
}
