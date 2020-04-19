package poo;

public class Perro {
    
    String nombre;
    String raza;
    double altura;
    
    public Perro(){
        
    }
    
    public void ladrar(){
        System.out.println("Guau guau");
    }
    public void caminar(){
        
    }
    public void saltar(){
        
    }
    public void recobrar(){
        
    }
    public void setNombre(String nombre){
        
        this.nombre = nombre;
        
    }
    public String getNombre(){
        
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public String toString(){
        
        String mensaje = "El nombre es: " + nombre + " la raza es: " + raza 
                + " su altura es: " + altura + "cm ";
        
        return mensaje;
    }
    
}
