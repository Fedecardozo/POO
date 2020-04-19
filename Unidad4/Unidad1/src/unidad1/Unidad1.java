package unidad1;

public class Unidad1 {

    public static void main(String[] args) {
        
        Empleado emp1 = new Empleado("Federico","Cardozo","15554",40,false,25000.00);

        System.out.println(emp1);
//        System.out.println("Aumento de salario: "+ 50 +"%" 
//                + " Salario actual: "+ emp1.AumentarSalario(50));
        System.out.println("Salario acutal: " + emp1.AumentarSalario(20));
        System.out.println("Categoria: " + emp1.categoria());
    }
    
}
