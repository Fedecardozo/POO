package tutorial3;

import java.util.Scanner;

/*Ejercicio 6: Construir un programa para trabajar con 2 números complejos, implemente el siguiente menú:
1. Sumar dos números complejos
2. Multiplicar 2 números complejos
3. Comparar 2 números complejos (iguales o no)
4. Multiplicar un número complejos por un entero*/

public class Tutorial3 {
    
    
    public static void main(String[] args) {
        
        int opcion;
        
        Operacion hacer = new Operacion();
        
        do {
            
            opcion = menu();
            CargarMetodo(opcion,hacer);
            resultado(opcion,hacer);
            
        } while (opcion != 5);
        
        
    }
    
    
    public static int menu(){
        
        int opc;
        
        Scanner e = new Scanner(System.in);  
            
            System.out.println("Ingrese la operacion que desea realizar: ");
            System.out.println("1) Sumar dos numeros complejos");
            System.out.println("2) Multiplicar dos numeros complejos");
            System.out.println("3) Comparar 2 numeros complejos: ");
            System.out.println("4) Multiplicar un numero complejos por un entero ");
            System.out.println("5) Para salir");
            opc = e.nextInt();
                  
            while(opc<1 || opc>5){

                System.out.println("Error, ingrese opcion nuevamente: ");
                opc = e.nextInt();

            }
            
            return opc;
            
    }
    public static void CargarMetodo(int x,Operacion hacer){
        
        Scanner e = new Scanner(System.in);
        
        switch(x){
            
            case 5:
                System.out.println("Hasta luego!!");
                break;
            case 4:
                System.out.println("Ingrese primero el numero imaginario y despues el entero: ");
                hacer.setImaginario1(e.nextDouble()); hacer.setEntero(e.nextInt());
                break;
            default:
                
            System.out.println("Ingrese los 2 numeros imaginarios: ");
            hacer.setImaginario1(e.nextDouble()); hacer.setImaginario2(e.nextDouble());
            break;
                
        }
        
    }
    
    public static void resultado(int x, Operacion hacer){
        
        Scanner e = new Scanner(System.in);

        switch(x){

            case 1:
                System.out.println("La suma es: " + hacer.suma() + " i");
               break;
            case 2:
                System.out.println("La multiplicacion es: " + hacer.multiplicacion() + " i");
                break;
            case 3:
                if(hacer.comparacion() == true){

                    System.out.println("La comparacion son iguales de: " + 
                          hacer.getImaginario1() + "i " + hacer.getImaginario2() + " i");
                }else{

                    System.out.println("La comparacion es desigual de: " + 
                            hacer.getImaginario1() + " i " + hacer.getImaginario2() + " i");
                }
                break;
            case 4:
                System.out.println("La multiplicacion es: " + hacer.multiplicacionEntero());
                break;
                
        }
    }
}
