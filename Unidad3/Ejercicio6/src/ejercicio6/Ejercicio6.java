package ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*6) Almacene en un ArrayList nombres de personas. Utilice un método que al digitar una posición
muestre el dato que contiene.*/
public class Ejercicio6 {

    public static void main(String[] args) {
        
        int num;
        
        List<String> nombres = new ArrayList<String>();
        
        nombres.add("Fede"); nombres.add("Ariel"); nombres.add("Marcos");
        nombres.add("Juan"); nombres.add("Pedro"); nombres.add("Chano");
        
        System.out.println("Ingrese el numero de posicion que desea saber: ");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
       // System.out.println(nombres.get(entrada.nextInt()-1));
        
       if(num<1 || num >6){
           
           System.out.println("No hay tal posicion");
           
       }else{
           
           System.out.println(nombres.get(num-1));
           
       }
               
       
    }
    
}
