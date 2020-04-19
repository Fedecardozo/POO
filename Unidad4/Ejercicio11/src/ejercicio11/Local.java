package ejercicio11;

import java.util.ArrayList;

public class Local {
    
    public boolean buscarCliente(ArrayList c,int id, String nombre){
        
        Cliente e = new Cliente(id,nombre);
        
        if(c.contains(e)){
            
            System.out.println("Lo hemos encontrado!!");
            return true;
        }else{
            System.out.println("No lo encontramos Ups!!");
            return false;
        }
  
    }
    
}
