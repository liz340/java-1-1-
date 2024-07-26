
package com.mycompany.evaluaciondecalificacionesconletras;

import java.util.Scanner;

public class Evaluaciondecalificacionesconletras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificacion numerica (0-100): ");
        double calificacion = scanner.nextDouble();

        if (calificacion < 0 || calificacion > 100) {
            System.out.println("Calificacion fuera del rango esperado (0-100). Calificacion ingresada: " + calificacion);
        } else {
            char letra;
            if (calificacion >= 90) {
                letra = 'A';
            } else if (calificacion >= 80) {
                letra = 'B';
            } else if (calificacion >= 70) {
                letra = 'C';
            } else if (calificacion >= 60) {
                letra = 'D';
            } else {
                letra = 'F'; 
            }
            System.out.println("La calificacion es: " + letra);
        }

        scanner.close();
    }
}