package tutorial2;

import java.util.Scanner;

/*Ejercicio 4: Construir un programa para una competencia de atletismo,
el programa debe gestionar una serie de atletas caracterizados por su número de atleta,
nombre y tiempo de carrera, al final el programa 
debe mostrar los datos del atleta ganador de la carrera.*/
public class Tutorial2 {

    public static void main(String[] args) {
        
        int cantidadAtletas;
        int numero;
        String nombre;
        float tiempo;
        int indice;
        
        
        System.out.println("Cuantos atletas son: ");
        Scanner entrada = new Scanner(System.in);
        cantidadAtletas = entrada.nextInt();
        
        Atleta competidor[]; competidor = new Atleta[cantidadAtletas];
        
        for (int i = 0; i < cantidadAtletas; i++) {
            
            entrada.nextLine();
            
            System.out.println("Ingrese datos del competidor N°" + (i+1) + ": ");
            System.out.print("Ingrese nombre del atleta: ");
            nombre = entrada.nextLine();
            System.out.print("Ingrese numero del atleta: ");
            numero = entrada.nextInt();         
            System.out.print("Ingrese tiempo que corrio el atleta: ");
            tiempo = entrada.nextFloat();
            
            competidor[i] = new Atleta(numero,nombre,tiempo);
            
        }
        
        indice = ganador(competidor);
        System.out.println("El atleta ganador es: " + competidor[indice].toString());
        
    }
    public static int ganador(Atleta competidor[]){
        
        float menor;
        int x=0;
        
        menor = competidor[0].getTiempo();
        
        for (int i = 1; i < competidor.length; i++) {
            
            if(competidor[i].getTiempo() < menor ){
                
                menor = competidor[i].getTiempo();
                x = i;
                
            }
            
        }
        
        return x;
    }
    
}
