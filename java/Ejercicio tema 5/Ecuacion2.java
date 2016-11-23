import java.util.Scanner;
public class Ecuacion2{
    public static void main(String[] args){
        System.out.println("Los sistemas de ecuaciones lineales, en el caso de dos ecuaciones con dos "+
        "incognitas se pueden representar de forma generica de la siguiente forma: \n"+
        "a·x+b·y=e \n"+
        "c·x+d·y=f \n"+

        "Un sistema de ecuaciones tiene solucion si: \n"+
        "a · d − b · c 6= 0 \n"+
        "La solucion de un sistema de dos ecuaciones con dos incognitas, en el caso que "+
        "lo tenga, viene dado por la siguiente regla, derivada de la regla de Cramer: \n"+
        "x ="+
        "e·d−b·f"+
        "a·d−b·c \n"+

        "y ="+
        "a·f−e·c"+
        "a·d−b·c");
        
        System.out.println("Ahora introduzca los coeficientes a, b, c y d separados por intros: ");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        valorDeX();
        valorDeY();
        solucion();
        
    }
    public static valorDeX(double x){
        
    }
    public static valorDeY(double y){

    }
    public static solucion(boolean solucion1){

    }
}