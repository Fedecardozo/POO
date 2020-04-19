package unidad1;

public class Empleado {
    
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public String categoria(){
        
        if(edad<21){
            return "Junior";
        }else if(edad>=21 && edad<=34){
            return "Intermedio";
        }else{
            return "Senior";
        }
        
    }
    public double AumentarSalario(int porcentaje){
        
        double aumento;
        aumento = salario + (salario * porcentaje)/100;
        return aumento;
        
    }

    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido +
                "\nCedula: " + cedula + "\nEdad: " + edad + "\nCasado: " + casado 
                + "\nSalario: " + salario;
    }
    
    
}
