package ejercicio3;
/*Cree la clase Animal con sus atributos raza (String) y nombre (String). Cree el método equals
de esa clase para poder comparar un animal con otro. Para ser considerado el mismo animal,
la raza y el nombre deberán ser iguales. Cree una clase ejecutable para verificar el correcto
funcionamiento de la clase anteriormente creada.*/

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Animal mamifero = new Animal("Alex","TiGre");
        Animal mamifero2 = new Animal("alex","Tigre");
        
        
        System.out.println( mamifero.hashCode());
        System.out.println( mamifero2.hashCode());
        
        System.out.println(mamifero.equals(mamifero2));
        
        
    }
    
}
