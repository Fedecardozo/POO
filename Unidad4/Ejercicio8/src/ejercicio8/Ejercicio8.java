package ejercicio8;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        Precio nuevo = new Precio(100.0);
        Factura a = new Factura(100.0,"20123456789","33123456789");
        
        //System.out.println(nuevo);
        //System.out.println(a);
        a.imprimirFactura();
        
    }
    
}
