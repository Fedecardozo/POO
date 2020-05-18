package repasandouni5;

public class Esfera extends Figura3D {
    
    private int radio;

    public Esfera() {
    }

    public Esfera(int radio, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double calcularVolumen(){
        return 3.14;
    }

    public void dibujar() {
        System.out.println("Esfera 3D");
    }
    
    
    
}
