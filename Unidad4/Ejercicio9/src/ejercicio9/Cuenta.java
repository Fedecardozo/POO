package ejercicio9;

public class Cuenta {
    
   // private int dniTitular;
    private double saldo = 0;
    
    public Cuenta(){
        
    }

    Cuenta(Persona p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//    public Cuenta(int dni, double saldo){
//        
//       // dniTitular = dni;
//        this.saldo = saldo;
//   }
//    public void setDni(int dni){
//        
//        dniTitular = dni;
//    }
//    public int getDni(){
//        
//        return dniTitular;
//    }
    public double getSaldo(){
        
        return saldo;
    }
    public boolean depositar(double importe){
        if(importe <= 0){
            
            return false;
        }else{
            
            saldo = saldo + importe;
            return true;
        }
        
    }
    
    public boolean extraer(double importe){
        
        double x;
        x = saldo - importe;
        
        if(x < 0){
            return false;
        }else{
            saldo = saldo - importe;
            return true;
        }
    }
    
//    public String toString(){
//        
//        return "DNI: " + dniTitular + " Saldo: " + saldo;
//    }
 //Ejercicio 10 
public class Persona {
    
    private int dni;
    protected String nombre = " ";
    protected int edad = 0;
    protected char sexo = ' ';

    public Persona(int dni) {
        this.dni = dni;
    }

    public Persona(int dni, char sexo) {
        this.dni = dni;
        this.sexo = sexo;
    }

    public Persona(int dni, String nombre, int edad, char sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona() {
    }

        Persona(Cuenta itau) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }
    public boolean esMayorDeEdad(){
        
        if(edad>17){
            return true;
        }else{
            return false;
        }
        
    }
    public String toString() {
        return "Dni: " + dni + " Nombre: " + nombre + " Edad: " + edad + " Sexo: " + sexo;
    }
    }    
}
