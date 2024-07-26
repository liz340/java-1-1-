package salarioneto;

import java.util.Scanner;

public class SalarioNeto {
//Impuesto = (Salario Bruto)x(Porcentaje de impuestos/100)
//Salario Neto = Salario Bruto - Impuesto - Deducciones Adicionales
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calcular salario");
        System.out.println("Calcula el impuesto");
        System.out.println("Calcula el salario neto");
        
        int salario = scanner.nextInt();
        
        
            
                System.out.print("Ingrese el salario bruto: ");
                salario = (int) scanner.nextDouble();
                double Impuesto = salario * 9.8 / 100;
                System.out.println("Impuesto: " + Impuesto);
               
                System.out.print("Ingrese el salario bruto: ");
                salario = (int) scanner.nextDouble();
                double SalarioNeto = salario - Impuesto;
                System.out.println("Salario Neto: " + SalarioNeto);
    }
    
}
