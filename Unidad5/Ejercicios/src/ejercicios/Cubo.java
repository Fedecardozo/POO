package ejercicios;

public class Cubo extends Figura3D{
    
    Cuadrado cuadrado;

    public Cubo() {
       
    }

    public Cubo(Cuadrado cuadrado, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.cuadrado = cuadrado;
    }

    public Cuadrado getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
    }
    
    public double calcularVolumen(){
        
        return 20.12;
        
    }
    
    public void dibujar(){
        
        System.out.println("Cubo");
        
    }
    
}
