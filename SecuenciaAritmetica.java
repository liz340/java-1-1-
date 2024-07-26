package com.mycompany.secuenciaaritmetica;

import java.util.Scanner;

public class SecuenciaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero de la secuencia: ");
        int primerNumero = scanner.nextInt();
        
        System.out.print("Ingrese la diferencia entre los numeros: ");
        int diferencia = scanner.nextInt();
        
        System.out.print("Ingrese el numero maximo: ");
        int numeroMaximo = scanner.nextInt();
        
        if (numeroMaximo < primerNumero) {
            System.out.println("El numero maximo debe ser mayor o igual al primer numero de la secuencia.");
        
        }
        
        int numeroActual = primerNumero;
        do {
            System.out.println(numeroActual);
            numeroActual += diferencia;
        } while (numeroActual <= numeroMaximo);
        
        scanner.close();
    }
}
