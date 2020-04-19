package ejercicio6;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Empleado nuevo = new Empleado("Fede","1531",22,true,20.000);
        Programador noob = new Programador("Lea","asds5",24,false,30.000);
        noob.setLenguajeDominante("JavaScript");
        noob.setLineasDeCodigoPorHora(100);
        
        System.out.println("Empleado: \n"+ nuevo);
        System.out.println("Aumento sueldo: " + nuevo.aumentarSalario(20));
        System.out.println("\nProgramador: \n" + noob);
        System.out.println("Categoria: " + noob.getCategoria());
    }
    
}
