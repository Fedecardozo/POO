package ejercicio1;

import java.util.Scanner;
/*2) Crea una clase cuyo método main ejecute una comparación letra a letra usando equals de dos
palabras usando bucles. Ejemplo: si las palabras son “avispa” y “ave” el programa debe dar
como resultado: ¿Letra 1 igual en las dos palabras? True. ¿Letra 2 igual en las dos palabras?
True ¿Letra 3 igual en las dos palabras? False ¿Letra 4 igual en las dos palabras? La palabra
2 no tiene letra 4 ¿Letra 5 igual en las dos palabras? La palabra 2 no tiene letra 5 ¿Letra 6
igual en las dos palabras? La palabra 2 no tiene letra 6.*/
public class Ejercicio1 {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String palabra;
        String palabra2;
        int flag = 0;
        int num,num2;
        
        System.out.println("Ingrese una palabra: ");
        palabra = entrada.nextLine();
        System.out.println("Ingrese otra palabra: ");
        palabra2 = entrada.nextLine();
        
        
        if(palabra.length() == palabra2.length()){
            
            num = palabra.length();
            num2 = palabra.length();
            
        }else{
            
            if(palabra.length() > palabra2.length()){
            
            num = palabra.length();
            num2 = palabra2.length();
            flag = 1;
            
            }else{
            
            num = palabra2.length();
            num2 = palabra.length();
            flag = 2;
        }
                  
        }
        
        
        for (int i = 0; i < num; i++) {
            
            if(i < num2){
                
                if((palabra.substring(i, i+1).equalsIgnoreCase(palabra2.substring(i,i+1))) ){
                
                System.out.println("¿Letra " + (i+1) + " igual es las dos palabras? " + true);
                
                }else{
                
                    System.out.println("¿Letra " + (i+1) + " igual es las dos palabras? " + false);

                }
                
            }else{
                
                if(flag == 1){
                    
                    System.out.println("¿Letra " + (i+1) + " igual es las dos palabras? "
                            + "La palabra 2 no tiene letra " + (i+1) );
                    
                }else if(flag == 2){
                    
                    System.out.println("¿Letra " + (i+1) + " igual es las dos palabras? "
                            + "La palabra 1 no tiene letra " + (i+1) );
                    
                }
                
                
            }
            
            
            
        }
        
        
        
    }
    
}
