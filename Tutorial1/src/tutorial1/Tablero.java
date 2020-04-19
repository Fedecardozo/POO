package tutorial1;

public class Tablero {
    // atributos
    private static int x = 0;
    private static int y = 0;
    
    //metodos
    
    //arriba
    public void arriba(){
        y +=1;
        System.out.println("Eligio arriba!");
        System.out.println("Posicion: (" +(x)+","+(y)+")");
    }
    public void abajo(){
        y -=1;
        System.out.println("Eligio abajo!");
        System.out.println("Posicion: (" +(x)+","+(y)+")");
    }
    public void derecha(){
        x +=1;
        System.out.println("Eligio derecha!");
        System.out.println("Posicion: (" +(x)+","+(y)+")");
    }
    public void izquierda(){
        x -=1;
        System.out.println("Eligio izquierda!");
        System.out.println("Posicion: (" +(x)+","+(y)+")");
    }
    
    public int getX(){
        
        return x;
        
    }
    public int getY(){
        
        return y;
        
    }
    
}
