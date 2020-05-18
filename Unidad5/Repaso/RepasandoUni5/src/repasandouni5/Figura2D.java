package repasandouni5;

public abstract class Figura2D extends Figura{

    public Figura2D() {
    }

    public Figura2D(String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
    }

    public abstract void dibujar();
    
    public abstract double calcularArea();
    
    public abstract double calcularPerimetro();
    
}
