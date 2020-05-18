package ejercicios;


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
        
        return radio * radio;
        
    }
    
    public void dibujar(){
        
        System.out.println("Esfera");
    }
    
}
