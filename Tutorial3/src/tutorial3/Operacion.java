/*Ejercicio 6: Construir un programa para trabajar con 2 números complejos, implemente el siguiente menú:
1. Sumar dos números complejos
2. Multiplicar 2 números complejos
3. Comparar 2 números complejos (iguales o no)
4. Multiplicar un número complejos por un entero*/
package tutorial3;

public class Operacion {
    
    private double imaginario1;
    private double imaginario2;
    private int entero;
    
    
    public Operacion(){
        
    }
    public Operacion(double imaginario1, int entero){
        
        this.imaginario1 = imaginario1;
        this.entero = entero;
        
    }

    public void setImaginario1(double imaginario1) {
        this.imaginario1 = imaginario1;
    }

    public void setImaginario2(double imaginario2) {
        this.imaginario2 = imaginario2;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public Operacion(double imaginario1, double imaginario2) {
        this.imaginario1 = imaginario1;
        this.imaginario2 = imaginario2;
    }

    public double getImaginario1() {
        return imaginario1;
    }

    public double getImaginario2() {
        return imaginario2;
    }
    
    public double suma(){
        
        return imaginario1 + imaginario2;
        
    }
    public double multiplicacion(){
        
        return imaginario1 * imaginario2;
    }
    
    public boolean comparacion(){
        
        if(imaginario1 == imaginario2){
            
            return true;
        }
        
       return false;  
        
    }
    public double multiplicacionEntero(){
        
        return (double)(imaginario1 * entero);
        
    }
    
}
