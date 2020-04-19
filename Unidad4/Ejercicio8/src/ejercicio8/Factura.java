package ejercicio8;

public class Factura extends Precio {
    
    private String emisor;
    private String cliente;
    
    public Factura(double importe, String emisor, String cliente){
        
        super(importe);
        this.importeNeto = importe;
        this.emisor = emisor;
        this.cliente = cliente;
        
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public String toString(){
        
        return super.toString() + "\n Emisor: " + emisor +
                "\n Cliente: " + cliente;
    }
    
    public void imprimirFactura(){
        
        System.out.println("Factura: \n Emisor: " + emisor +"\n Cliente: " + cliente);
        System.out.println("\nPrecio: \n Importe Neto: $" + importeNeto + "\n IVA 21.0%: $" + porcentajeIva
        + "\n Importe total: " + super.getImporteTotal());
    }
}
