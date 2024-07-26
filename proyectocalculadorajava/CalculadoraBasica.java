package calculadora.proyecto;

public class CalculadoraBasica {
    //atributos
    private int operando1;
    private int operando2;
   
    //Constructores
    public CalculadoraBasica(){
        
    }
    
    public CalculadoraBasica(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
    //Metodos
    public int sumar(){
        int suma = this.operando1 + this.operando2;
        return suma;
    }
    
    public int restar(){
        int resta = this.operando1 - this.operando2;
        return resta;
    }
    
    public int multiplicar(){
        int multiplicar = this.operando1 * this.operando2;
        return multiplicar;
    }
    
    public double dividir(){
        double division = (double)this.operando1 / (double)this.operando2;
        return division;
    }

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
    
    
}
