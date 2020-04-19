package ejercicio12;
/*Declara una clase que represente el tipo enumerado que define tipos de madera con los
valores ROBLE, CAOBA, NOGAL, CEREZO. Siendo sus pesos específicos 800, 770, 820 y 790 kg/m3
respectivamente. Crea un programa que muestre el peso de los palets de cada uno
de los tipos de madera. Nota: un palet admite 2.27 m3 de volumen por lo que el peso total del
palet se calculará de la siguiente forma: 2.27 m3 * peso específico de la madera (en kg/ m3).*/
public enum Madera {
    
    ROBLE("kg/m3",800),CAOBA("kg/m3",770), NOGAL("kg/m3",820), CEREZO("kg/m3",790);
     
    private int peso;
    final double metro3 = 2.27;
    private String kg;
    
    private Madera (String kg ,int peso){
       
       this.kg = kg; 
       this.peso = peso; 
       
    }

    public static Madera getROBLE() {
        return ROBLE;
    }

    public static Madera getCAOBA() {
        return CAOBA;
    }

    public static Madera getNOGAL() {
        return NOGAL;
    }

    public static Madera getCEREZO() {
        return CEREZO;
    }

    public int getPeso() {
        return peso;
    }

    public double getMetro3() {
        return metro3;
    }

    public String getKg() {
        return kg;
    }

    @Override
    public String toString() {
        return "Peso: " +(double) (peso * metro3) + " " + kg;
    }
    
    
}
