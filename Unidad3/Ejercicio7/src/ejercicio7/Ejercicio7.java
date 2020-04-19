package ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*7) Almacene en un ArrayList nombres de personas. Utilice un método que al digitar una posición
elimine el dato que contiene.
*/
public class Ejercicio7 {

    public static void main(String[] args) {
        
        int indice;
        
        Scanner entrada = new Scanner(System.in);
        List<String> nombres = new ArrayList<String>();
        
        nombres.add("Fede"); nombres.add("Ariel"); nombres.add("Marcos");
        nombres.add("Juan"); nombres.add("Pedro"); nombres.add("Chano");
        nombres.add("Evelio"); nombres.add("Julian"); nombres.add("Alan");
        
        System.out.print("Ingrese la posicion que desea elminar: ");
        indice = entrada.nextInt();
        
        if(indice<1 || indice>9){
            
            System.out.print("\nNo existe tal posicion!!");
            
        }else{
            System.out.println("\nAsi estaba antes: ");
            nombres.forEach((mostrar)->{
          
            System.out.print(mostrar + "-");
            });
            nombres.remove(indice-1);
            
        }
        System.out.println("\n\nAsi quedo: ");
        nombres.forEach((mostrar)->{
          
            System.out.print(mostrar + "-");
        });
        System.out.println(" ");
    }
    
}
