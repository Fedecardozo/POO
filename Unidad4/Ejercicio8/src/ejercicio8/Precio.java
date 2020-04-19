package ejercicio8;

public class Precio {
    
    protected double importeNeto;
    protected double porcentajeIva = 21.0;
    
    public Precio(double importe){
        
        importeNeto = importe;
        
    }

    public double getImporteNeto() {
        return importeNeto;
    }

    public void setImporteNeto(double importeNeto) {
        this.importeNeto = importeNeto;
    }

    public double getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setPorcentajeIva(double porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }
    public double getImporteTotal(){
        double total;
        total = importeNeto + (importeNeto * porcentajeIva)/100;
        return total;
    }
    public double importeIva(){
        
        return 21.0;
    }
    public String toString(){
        
        return "Importe neto: " + importeNeto + "\nPorcentaje I.V.A: " + porcentajeIva;
    }
}
