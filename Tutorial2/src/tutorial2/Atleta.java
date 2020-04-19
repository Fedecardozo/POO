/*Ejercicio 4: Construir un programa para una competencia de atletismo,
el programa debe gestionar una serie de atletas caracterizados por su número de atleta,
nombre y tiempo de carrera, al final el programa 
debe mostrar los datos del atleta ganador de la carrera.*/
package tutorial2;

public class Atleta {
    //atributo
    
    private int num;
    private String nombre;
    private float tiempo;
    
    public Atleta(int num, String nombre, float tiempo){
        
        this.num = num;
        this.nombre = nombre;
        this.tiempo = tiempo;
        
    }
    public void setNum(int num){
        
        this.num = num;
        
    }
    public int getNum(){
        
        return num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        
        String mensaje = "Atleta " + " Numero: " + num + ", Nombre: " + nombre + ", Tiempo: " + tiempo;
        return  mensaje;
    }
    
    
}
