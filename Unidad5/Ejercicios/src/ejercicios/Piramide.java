package ejercicios;

public class Piramide extends Figura3D {
    
    private int altura;
    private Triangulo triangulo;

    public Piramide() {
        
    }

    public Piramide(int altura, String nombre, int grosorBorde, int color, Triangulo triangulo) {
        super(nombre, grosorBorde, color);
        this.altura = altura;
        this.triangulo = triangulo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public Triangulo getTriangulo(){
        
        
        return triangulo;
    }
    
    public void setTriangulo(Triangulo triangulo){
        
        this.triangulo = triangulo;
        
    }
    
    public double calcularVolumen(){
        
        return 5.25;
        
    }
    
    public void dibujar(){
        
        System.out.println("Piramide");
        
    }
    
}
