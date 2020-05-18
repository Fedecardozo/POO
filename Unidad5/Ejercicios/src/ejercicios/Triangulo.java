package ejercicios;

public class Triangulo extends Figura2D{
    
    private int base;
    private int altura;

    public Triangulo() {
       
    }

    public Triangulo(int base, int Altura, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.base = base;
        this.altura = Altura;
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

    public void setAltura(int Altura) {
        this.altura = Altura;
    }
    
    public double calcularArea(){
        
        double area = base * altura;
        
        return area;
    }
    
    public double calcularPerimetro(){
        
        return this.calcularArea()*3.14;
        
    }
    
    public void dibujar(){
        
        System.out.println("Tringulo");
        
    }
    
    public int cambiarTamanio(){
        
        return 22;
    }
    
}
