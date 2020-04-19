/*11) Declara una clase que represente el tipo enumerado que define las posiciones de un equipo
de fútbol con los valores ARQUERO, DEFENSOR, MEDIOCAMPISTA y DELANTERO. Con
esta especificación se deberá crear la clase enum denominada “Posicion”. Luego, cree la clase
Futbolista cuyos atributos serán: nombre (String), numero (int), pos (Posicion). Instancie la
clase Futbolista de forma tal de poder crear un jugador de fútbol. Ejemplo: Futbolista jug1 =
new Futbolista("Juan Román Pérez", 10, Posicion.MEDIOCAMPISTA);*/
package ejercicio11;

import ejercicio11.Ejercicio11.Posicion;

public class Futbolista {
    
    private String nombre;
    private int numero;
    private Posicion pos;

    public Futbolista(String nombre, int numero, Posicion pos) {
        this.nombre = nombre;
        this.numero = numero;
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nNumero: " + numero + "\nPosicion: " + pos;
    }
    
    
    
}
