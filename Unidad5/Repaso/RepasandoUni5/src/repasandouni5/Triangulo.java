package repasandouni5;

public class Triangulo extends Figura2D {
    
    private int base;
    private int altura;

    public Triangulo() {
    }

    public Triangulo(int base, int altura, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double calcularArea() {
         double resu = base * altura;
         return resu;
    }

    public double calcularPerimetro() {
        double resu = this.calcularArea() * 2;
        return resu;
    }
    
     public void dibujar() {
     
         System.out.println("  * "+"\n * * \n* * * ");
     
     }  
     
     public int cambiarTamanio(){
         
         return 5;
     }
     
}
