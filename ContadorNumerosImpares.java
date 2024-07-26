package com.mycompany.contadornumerosimpares;

import java.util.Scanner;

public class ContadorNumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero mayor que 0: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("Se callo el sistema picale a run plis.");
            
        }
        
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= numero);
        
        scanner.close();
    }
}
