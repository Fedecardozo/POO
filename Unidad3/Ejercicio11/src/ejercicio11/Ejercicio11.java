/*11) Declara una clase que represente el tipo enumerado que define las posiciones de un equipo
de fútbol con los valores ARQUERO, DEFENSOR, MEDIOCAMPISTA y DELANTERO. Con
esta especificación se deberá crear la clase enum denominada “Posicion”. Luego, cree la clase
Futbolista cuyos atributos serán: nombre (String), numero (int), pos (Posicion). Instancie la
clase Futbolista de forma tal de poder crear un jugador de fútbol. Ejemplo: Futbolista jug1 =
new Futbolista("Juan Román Pérez", 10, Posicion.MEDIOCAMPISTA);*/
package ejercicio11;

public class Ejercicio11 {

    enum Posicion {ARQUERO, DEFENSOR, MEDIOCAMPISTA, DELANTERO};
    
    public static void main(String[] args) {
        
        Futbolista juga1 = new Futbolista("Federico Cardozo",11,Posicion.DELANTERO);
        
        System.out.println(juga1);
        
    }
    
}
