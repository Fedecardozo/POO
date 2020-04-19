package ejercicio6;

public class Programador extends Empleado {
    
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;
    
    public Programador(){
        
    }
    public Programador(String nombre, String cedula, int edad, boolean casado, double salario){
        
        super(nombre,cedula,edad,casado,salario);
    }
    public Programador(String nombre, String cedula, int edad, boolean casado, double salario,int cantidad,String lenguaje){
        
        this.nombre = nombre;
        this.cedula = cedula;
        lineasDeCodigoPorHora = cantidad;
        lenguajeDominante = lenguaje;
        
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }
    
    public String toString(){
        
        return super.toString() + "\nLineas de codigo por hora: " + lineasDeCodigoPorHora
                + "\nLenguaje Dominante: " + lenguajeDominante;
    }
    
}
