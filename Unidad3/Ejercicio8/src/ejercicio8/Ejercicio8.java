package ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;
/*8) Dado un ArrayList con números, utilice un método que al digitar una posición reemplace el
dato que contiene por uno ingresado por el usuario.*/
public class Ejercicio8 {

    public static void main(String[] args) {
        
        int indice;
        
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            
            numeros.add((int) (Math.random()*17 + 1));
            System.out.print((i+1)+")"+ numeros.get(i) + " ");
    
        }
        System.out.println(" ");
        System.out.print("\nIngrese la posicion del numero que quiere reemplazar: ");
        indice = entrada.nextInt();
        
        if(indice<1 || indice>10){
            
            System.out.println("\nNo exite tal posicion");
        }else{
            
            indice = indice-1;
          //  numeros.remove(indice);
            System.out.print("\nIngrese el numero nuevo: ");
            numeros.set(indice, entrada.nextInt());
            System.out.println(numeros);

        }
        System.out.println(" ");
    }
    
}
