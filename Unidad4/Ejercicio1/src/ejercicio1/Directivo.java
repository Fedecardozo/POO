package ejercicio1;

final class Directivo extends Empleado {
    
    public Directivo(String nombre){
        
        super(nombre);
        
    }
    
    public String toString(){
        
        return super.toString() + " -> Directivo";
    }
    
}
