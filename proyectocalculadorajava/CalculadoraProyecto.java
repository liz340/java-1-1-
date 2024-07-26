package calculadora.proyecto;

public class CalculadoraProyecto {

    public static void main(String[] args) {
        // TODO code application logic here
        
        CalculadoraBasica miCalculadora = new CalculadoraBasica(10,5);
        //aqui el 10 se pasa al operando 1 y el 5 al operando 2
        
        int suma = miCalculadora.sumar();
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es " + miCalculadora.restar());
        System.out.println("La multiplicacion es " + miCalculadora.multiplicar());
        System.out.println("La division es " + miCalculadora.dividir());
    }
    
}
