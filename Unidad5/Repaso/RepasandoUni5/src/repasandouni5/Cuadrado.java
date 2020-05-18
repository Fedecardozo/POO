package repasandouni5;

public class Cuadrado extends Figura2D {
    
    int lado;

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
    
    public void dibujar() {
        
        System.out.println("*****\n*   *\n*****");
        
    }

    public double calcularArea() {
        
        double resu = lado * 4;
        return resu;
    }

    public double calcularPerimetro() {
        
        double peri = lado * 3.14;
        return peri;
        
    }
    
    public int cambiarTamanio(){
         
         return 5;
         
     }
    
}
