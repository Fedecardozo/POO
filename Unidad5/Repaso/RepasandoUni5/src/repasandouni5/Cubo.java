package repasandouni5;

public class Cubo extends Figura3D {

    private Cuadrado cuadro;
    
    public Cubo() {
    }

    public Cubo(String nombre, int grosorBorde, int color, Cuadrado cuadro) {
        super(nombre, grosorBorde, color);
        this.cuadro = cuadro;
    }

    public Cuadrado getCuadro() {
        return cuadro;
    }

    public void setCuadro(Cuadrado cuadro) {
        this.cuadro = cuadro;
    }
    
    public double calcularVolumen(){
        return 3.14;
    }
    
    public void dibujar(){
        System.out.println("Cubo Rubik");
    }
    
}
