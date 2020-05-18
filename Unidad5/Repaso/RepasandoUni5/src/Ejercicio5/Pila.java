package Ejercicio5;

import java.util.ArrayList;

public class Pila implements Icoleccion {
    
    static ArrayList coleccion = new ArrayList();
    private int contador;

    public Pila(int contador) {
        this.contador = contador;
    }
 
    public boolean estaVacia() {
        
        return coleccion.isEmpty();
        
    }

    public Object extraer() {
        return coleccion.get(contador);
    }

    public Object primero() {
        return coleccion.get(0);
    }

    public boolean agregar(Object obj) {
        coleccion.add(contador, obj);
        return true;
    }
    
    public String toString(){
        
        return ""+coleccion;
        
    }
    
}
