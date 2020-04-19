package tutorial1;

import java.util.Scanner;

 /*Construir un programa que permita dirigir el movimiento de 
un objeto dentro de un tablero y actualice su posición dentro del mismo.
Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. 
Tras cada movimiento el programa mostrará la nueva dirección elegida y 
las coordenadas de situación del objeto dentro del tablero.*/
public class Tutorial1 {

    public static void main(String[] args) {
        
        char direccion;
        int posiX;
        int posiY;
        Tablero tabla = new Tablero();
        
        System.out.println("Bienvenido a jugando con Fede ");
        System.out.println("Si usted se posiciona en '-1' pierde. Si se posisciona en (3,3) gana");
        System.out.println("Movimientos: 'w'=arriba, 's'= abajo, 'a'=izquierda, 'd'=derecha, 'f'=finalizar");
        System.out.println("INICIO! posicion inicial(0,0)");
        Scanner entrada = new Scanner(System.in);
        
        do {
            
            direccion = entrada.next().charAt(0);
            
            switch(direccion){
                
                case'w':
                    tabla.arriba();
                    break;
                case's':
                    tabla.abajo();
                    break;
                case'a':
                    tabla.izquierda();
                    break;
                case 'd':
                    tabla.derecha();
                    break;
                case 'f':
                    System.out.println("Finalizo el juego");
                    break;
                default:
                    System.out.println("Error, no existe ese comando!!");
                    break;
  
            }
            posiX = tabla.getX();
            posiY = tabla.getY();
            
            if(posiX == -1 || posiY == -1){
                
                System.out.println("/nPerdiste sos un perdedor jaja");
                direccion = 'f';
                
            }
            
            if(posiX == 3 && posiY==3){
                
                System.out.println("Ganaste GENIOO!!");
                direccion = 'f';
                
            }
       
            
        } while (direccion != 'f');
 
    }
    
}
