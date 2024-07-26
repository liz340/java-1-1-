package calcularpreciocondescuento;

import java.util.Scanner;

public class CalcularPrecioConDescuento {
//Precio <= 100: Sin descuento
//Precio > 100 y <= 200: 10% de descuento
//Precio > 200 y <= 500: 20% de descuento
//Precio > 500: 25% de descuento
    public static void main(String[] args) {
        // TODO code application logic here
        int venta;
        float preciofinal;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el monto de la venta");
        venta = leer.nextInt();
        
        if(venta <= 100){
            preciofinal = venta - 0;
        }else if (venta > 100){
            preciofinal = venta - (venta * 0.10f);
        }else if (venta > 200){
            preciofinal = venta - (venta * 0.20f);
        }else if (venta > 500){
            preciofinal = venta - (venta * 0.25f);
        }else{
            preciofinal = venta ;
        }  
        
        System.out.println("El precio final es: "+ preciofinal);
    }
    
}
