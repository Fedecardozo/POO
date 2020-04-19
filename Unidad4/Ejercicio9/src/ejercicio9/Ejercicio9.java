package ejercicio9;

import ejercicio9.Cuenta.Persona;
import java.util.Scanner;

public class Ejercicio9 {

   static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int opcion;
       
        Persona p1 = null,p2=null,p3=null;
        Cuenta itau = new Cuenta();
        
        System.out.print("Ingrese numero de D.N.I: ");
        p1(40826);
//        itau.setDni(entrada.nextInt());
        
        menu(itau);
        
 
    }
    
    public static void menu(Cuenta banco){
        
        int opcion;
        
        System.out.println("Ingrese la operacion que desea realizar");
        
        do {
            System.out.print("Opcion 1 para depositar dinero");
            System.out.print("\nOpcion 2 para extraer dinero");
            System.out.print("\nOpcion 3 para consultar saldo");
            System.out.print("\nOpcion 4 para salir");
            System.out.print("\nOpcion: ");
            opcion = entrada.nextInt();
            
            while(opcion<1 || opcion>4){
            
            System.out.print("Error, ingrese nuevamente opcion: ");
            opcion = entrada.nextInt();
            
            }
            
            operacion(opcion,banco);
            
        } while (opcion != 4);
    }
    
    public static void operacion(int o, Cuenta banco){
        
        boolean estado;
        
        switch(o){
            
            case 1:
                System.out.print("\nIngrese la cantidad que desea depositar: ");
                estado = banco.depositar(entrada.nextDouble());
                if(estado == true){
                    System.out.println("Se realizo el deposito con exitos\n");
                }else{
                    
                    System.out.println("Error!!. No se puede realizar la operacion\n");
                }
                break;
            case 2:
                System.out.print("\nIngrese la cantidad que desea extraer: ");
                estado = banco.extraer(entrada.nextDouble());
                if(estado == true){
                    System.out.println("\nSe realizo la extraccion con exitos\n");
                }else{
                    
                    System.out.println("\nError!!. No se puede realizar la operacion\n");
                }
                break;
            case 3:
                System.out.println("\nSu saldo actual es de: " + banco.getSaldo()+"\n");
                break;
            default:
                System.out.println("Hasta luego, vuelva prontos!");
                break;
        }
        
    }

    private static void p1(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
