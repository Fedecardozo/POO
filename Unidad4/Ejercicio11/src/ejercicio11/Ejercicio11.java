package ejercicio11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        int num;
        String name;
        
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Cliente> clientes = new ArrayList();
        
        System.out.println("Ingrese id y nombre del cliente que desea buscar: ");
        
        System.out.print("Nombre: ");
        name = entrada.nextLine();
        
        System.out.print("Id: ");
        num = entrada.nextInt();
   
        clientes = llenar();
        for(ArrayList df: clientes){
            
        }
        
        Local buscar = new Local();
        buscar.buscarCliente(clientes, num, name);
        
    }
    
    public static ArrayList llenar(){
        
        Cliente[] cl; cl = new Cliente[5];
        //cl[0] = null;
        ArrayList<Cliente> clientes = new ArrayList();
        
        
        cl[0] = new Cliente(123,"Fede");
        cl[1] = new Cliente(1234,"Ariel");
        cl[2] = new Cliente(125,"Cardozo");
        cl[3] = new Cliente(126,"Lea");
        cl[4] = new Cliente(127,"Marcos");
        
        for (int i = 0; i < 5; i++) {
            
            clientes.add(cl[i]);
            
        }
        
        
        return clientes;
        
    }
    
}
