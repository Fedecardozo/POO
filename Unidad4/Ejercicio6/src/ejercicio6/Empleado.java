package ejercicio6;

public class Empleado {
    
    protected String nombre;
    protected String cedula;
    private int edad;
    private boolean casado;
    private double salario;
    
    public Empleado(){
        
    }
    public Empleado(String nom,String cedu,int ed, boolean casa, double sala){
        
        nombre = nom;
        cedula = cedu;
        edad = ed;
        casado = casa;
        salario = sala;
       
    }
    
    public String getCategoria(){
        
        String categoria = null;
        
        if(edad <= 21){
            categoria = "Principiante";
        }else if(edad >= 22 && edad <= 35){
            categoria = "Intermedio";
        }else if(edad > 35){
            categoria = "Senior";
        }
        return categoria;
    }
    
    public String toString(){
        
        return "Nombre: " + nombre + "\nCedula: " + cedula  
               + "\nEdad: " + edad + "\nCasado: " + casado + "\nSalario: " + salario;
    }
    
    public double aumentarSalario(int porcentaje){
        
        double aumento;
        aumento = salario + ((salario * porcentaje)/100);
        return aumento;
        
    }
    
}
