package ejercicio10;

import java.util.ArrayList;
import java.util.Iterator;
/*10) Utilizar un Iterador para calcular el promedio de un conjunto de valores almacenados en un
ArrayList.*/

public class Ejercicio10 {

    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            
            numeros.add((int) (Math.random()*22 + 1));
   
        }
        promedio(numeros);
        
    }
    public static void promedio(ArrayList x){
        
        int z = 0;
        double p;
        Iterator i = x.iterator();
        
        while(i.hasNext()){
            
            z = z + (int) (i.next());
          
        }
        
        p = (double) (z);
        System.out.println(x);
        System.out.println("El promedio es: " + p/x.size());
    }
}
