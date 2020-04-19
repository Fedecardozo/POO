package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;
/*5) Crear un ArrayList y llenarlo con 10 números aleatorios. Luego buscar un número ingresado
por teclado*/
public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            
            numeros.add((int) (Math.random()*6 + 1));
            System.out.print( numeros.get(i) + "-");
    
        }
        System.out.println(" ");
        System.out.println("Ingrese el numero que quiere buscar: ");
        
        if(numeros.contains(entrada.nextInt())){
            
            System.out.println("Lo hemos encontrado!" );
            
        }else{
            
            System.out.println("No lo encontramos!");
            
        }
        
    }
    
}
