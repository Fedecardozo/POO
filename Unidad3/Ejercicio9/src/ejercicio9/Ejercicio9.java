package ejercicio9;

import java.util.ArrayList;
import java.util.Iterator;
/*9) Dado un ArrayList con números, desarrolle un método que muestre por pantalla el número
mayor y otro método que muestre el menor de la lista. Utilice un Iterador para recorrer el
ArrayList.*/
public class Ejercicio9 {

    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            
            numeros.add((int) (Math.random()*17 + 1));
   
        }
        System.out.println(numeros);
        //Para buscar el mayor
        mayor(numeros);
        //Para buscar el menor
        otraForma(numeros);
    }
    public static void mayor(ArrayList numeros){
        
        int uno; int m = 0;// int n = 99;
        Iterator i = numeros.iterator();
        
        while(i.hasNext()){
            
            uno = (int) (i.next());
            
            if(uno > m){
                
                m = uno;
                
            }
           /* if(uno < n){
                
                n = uno;
                
            }*/
        }
        
        System.out.println("El numero mayor es: " + m);
        //System.out.println("El numero menor es: " + n);
    }
    public static void otraForma(ArrayList numeros){
        
        int uno; int m = 0;// int n = 0;
        //int j=0;
        Iterator i = numeros.iterator();
        
        while(i.hasNext()){
            
            uno = (int) (i.next());
            //if(j == 0){
            // De esta forma me puedo ahorrar una variable
            if(m==0){    
                
                m = uno;
                //n = uno;
               // j++; esta forma tambien esta bien
                
            }else{
            
               /* if(uno > m){

                    m = uno;

                }*/
                if(uno < m){

                    m = uno;

                }
            }
            //j++; esta bien de las 2 formas
        }
       // System.out.println("jota vale; " + j);
       // System.out.println("El numero mayor es: " + m);
        System.out.println("El numero menor es: " + m);
    }
    
}
