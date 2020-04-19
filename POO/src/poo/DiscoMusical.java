package poo;


public class DiscoMusical {
    
   private String titulo;
   private String autor;
   private int anioEdicion;
   private String formato;
   private boolean digital;

    public DiscoMusical() {
        
    }
    
    public void setTitulo(String titulo){
        
        this.titulo = titulo;
        
    }
    public String getTitulo(){
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public boolean isDigital() {
 
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    @Override
    public String toString() {
        return "Titulo=" + titulo + ", autor=" + autor + ", anioEdicion=" + anioEdicion + ", formato=" + formato + ", digital=" + digital;
    }
    
}
