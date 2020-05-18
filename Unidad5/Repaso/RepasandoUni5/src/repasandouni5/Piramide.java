package repasandouni5;

public class Piramide extends Figura3D {
    
    private int altura;
    private Triangulo triangulo;

    public Piramide() {
    }

    public Piramide(int altura, String nombre, int grosorBorde,Triangulo tri, int color) {
        super(nombre, grosorBorde, color);
        this.altura = altura;
        triangulo = tri;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Triangulo getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }
    
    public double calcularVolumen(){
        
        return 3.21;
    }

    public void dibujar() {
        System.out.println("Piramide 3D");
    }
    
    
}
