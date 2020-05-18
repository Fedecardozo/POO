package ejercicio5;

import java.util.ArrayList;

public class Pila implements IColeccion {

    static ArrayList coleccion = new ArrayList();
    static int contador = 0;

    public Pila() {
        
    }
    
    public boolean estaVacia() {
        
        if(contador == 0){
            
            return true;
            
        }else{
            
            return false;
            
        }
        
    }

    public Object extraer(int i) {

        if(this.estaVacia()){
            
            return null;
            
        }else{
        
            if(i < coleccion.size()){
                Object uno = coleccion.get(i);
                coleccion.remove(uno);
                contador--;
                return uno; 
                
            }else{
                
                return null;
                
            }
            

        }

    }

    public Object primero() {
      
        if(this.estaVacia()){
            
            return null;
            
        }else{
            
            return coleccion.get(0);
            
        }
        
    }

    public boolean agregar(Object obj) {
        
        coleccion.add(obj);
        contador++;
        return true;
        
    }

    public String toString() {

        return ""+coleccion;
    }
    
    

}
