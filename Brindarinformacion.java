package com.mycompany.brindarinformacion;

import java.util.Scanner;

public class Brindarinformacion {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Peliculas disponibles:");
        System.out.println("Forest Gum");
        System.out.println("Spitermen");
        System.out.println("Chueco 2");
        System.out.println("Pie chiquito");
        System.out.println("Los 50 dalmatas de Grey");
        System.out.print("Ingrese el nombre de la pelicula de la lista: ");
        
        String pelicula = scanner.nextLine().trim();

        String info;

        info = switch (pelicula) {
            case "Forest Gum" -> "Trata de un soldado, un bailarin, un jugador de pin pong profesional, dueno de un barco pesquero, de un hombre que trabaja podando cesped, que al final contrae sida y se le muere la disque novia y cria a un nino que supuestamente es suyo.";
            case "Spitermen" -> "Trata de un hombre que se pega a las paredes donde se le muere el tio por un balazo y a la novia.";
            case "Chueco 2" -> "Trata de la continuacion de Chueco 1.";
            case "Pie chiquito" -> "Trata de un dinosaurio que tiene el pie chiquito que protagoniza 68 peliculas, 8 temporadas animadas, tambien un live action.";
            case "Los 50 dalmatas de Grey" -> "Trata de 50 dalmatas y su dueno Grey.";
            default -> "Haz lo que se te pide vuelve a intentarlo >:[";
        };
//Cuando escriba el nombre de la pelicua hagalo igual como esta con espacios y mayusculas :)
        System.out.println(info);

        scanner.close();
    }
}
