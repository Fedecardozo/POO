package repasandouni5;

public class Circulo extends Figura2D {
    
    private int radio;

    public Circulo() {
    }

    public Circulo(int radio, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.radio = radio;
    }

    public void dibujar() {
        
        System.out.println("  ****\n********\n*********\n********\n  ****");
        
    }

    public double calcularArea() {
        return radio * 2.14;
    }

    public double calcularPerimetro() {
        return radio+3.14*2;
    }
    
    public int cambiarTamanio(){
         
         return 5;
         
     }
    
}
