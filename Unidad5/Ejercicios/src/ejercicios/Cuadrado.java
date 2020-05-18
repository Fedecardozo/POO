package ejercicios;

public class Cuadrado extends Figura2D {
    
    private int lado;

    public Cuadrado() {
        
    }

    public Cuadrado(int lado, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public double calcularArea(){
        
        return lado * lado;
        
    }
    
    public double calcularPerimetro(){
        
        return this.calcularArea()*3.14;
        
    }
    
    public void dibujar(){
        
        System.out.println("Cuadrado");
        
    }
    
    public int cambiarTamanio(){
        
        return 5;
        
    }
    
}
