package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio4 {
/*4) Crear un ArrayList y llenarlo con al menos 10 nombres de personas.*/
    public static void main(String[] args) {
        
        String llenar;
        
        Scanner entrada = new Scanner(System.in);
        List<String> nombres;
        nombres = new ArrayList<String>();
        
        System.out.println("Ingrese 10 nombres:");
        
        for (int i = 0; i < 10; i++) {
            
            llenar = entrada.nextLine();
            nombres.add(llenar);
            
        }
       
        nombres.forEach((names)->{
        
            System.out.print(names + "-");
        
        });
        
        
    }
    
}
