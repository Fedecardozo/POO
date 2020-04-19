package ejercicio3;

import java.util.Objects;


public class Animal {
    
    private String nombre;
    private String raza;

    public Animal(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    
    public String getNombre(){
        
        return nombre;
    }
 
    public String getRaza(){
        
        return raza;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash = hash + Objects.hashCode(this.nombre);
        hash = hash + Objects.hashCode(this.raza);
        return hash;
    }

   @Override
    public boolean equals(Object obj) {
        
        Animal otro;
        otro = (Animal) (obj);
        
        if(this.nombre.equalsIgnoreCase(otro.getNombre()) && this.raza.equalsIgnoreCase(otro.getRaza())){
            
            return true;
        }else{
            
            return false;
            
        }
        
        
    }

}
