//importamos la libreria Scanner
import java.util.Scanner;
public class DoceNumeros{
    public static void main(String [] args){
        /** Programa que lea doce numeros decimales por teclado crea una 
        clase denominada DoceNumeros. Posteriormente muestra 
        por pantalla todos los valores tabulados
        (con mas de un espacio blanco entre ellos) en cuatro filas y con dos
        decimales. (Debes usar el comando printf ) */
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int totalNumero = 12;
        String sumatorio = "";
        double numero = 0;
        for(i=0;i<totalNumero;i++){
            System.out.printf("Introduce un doce numeros decimales, llevas %d \n",i);
            numero = sc.nextDouble();
            sumatorio += (numero + "\t");
        }
        sc.close();
        System.out.printf(sumatorio+"\n");
        //System.out.printf(numero[]+"\t"+numero[]+"\t"+numero[]+"\t"+numero[]+"\t\n");
        
        
    }
    
}