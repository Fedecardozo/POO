package ejercicios;

public class Circulo extends Figura2D {

    private int radio;
    
    public Circulo() {
    }

    public Circulo(String nombre, int grosorBorde, int color,int radio) {
        super(nombre, grosorBorde, color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
        public double calcularArea(){
        
        return radio * radio;
        
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
