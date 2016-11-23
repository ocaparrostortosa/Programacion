//Importamos la libreria de Scanner
import java.util.Scanner;

//Creamos la clase principal
public class Plural{
    //Creamos el método main
    public static void main(String[] args){
        //Se define el objeto Scanner para poder usarlo posteriormente.
        Scanner sc = new Scanner (System.in);

        //Se le pide al usuario la palabra que usaremos.
        System.out.println("Introduce una palabra:");
        String palabra = sc.next();

        //Se hace la llamada del método
        pluralPalabra(palabra);
        
    }
    //Creamos el método que nos devolverá el valor de la palabra
    public static String pluralPalabra(String palabra){
        //Creamos la sentencia de control que nos permitirá convertir la palabra a plural.
         if (palabra.toLowerCase().endsWith("a") || palabra.endsWith("e") || palabra.endsWith("i") || palabra.endsWith("o") || palabra.endsWith("u") || palabra.endsWith("é")){
            palabra+="s";  
        }else if(palabra.endsWith("á") || palabra.endsWith("ó")){
            palabra+="s";
        }else if(palabra.endsWith("í") || palabra.endsWith("ú")){
            palabra+=("es o "+palabra+"s");
        }else if(palabra.endsWith("y") || palabra.endsWith("ay") || palabra.endsWith("ey") || palabra.endsWith("iy") || palabra.endsWith("oy") || palabra.endsWith("uy")){
            palabra+="es";
        }else if(palabra.endsWith("s") || palabra.endsWith("x")){
            palabra+="";
        }else if(palabra.endsWith("l") || palabra.endsWith("r") || palabra.endsWith("n") || palabra.endsWith("d") || palabra.endsWith("z") || palabra.endsWith("j")){
            palabra+="es";
        }else{
            System.out.println("No se ha podido encontrar el plural, por favor pruebe de nuevo\n"+
            " *Puede ser que la palabra que haya insertado se encuentre en mayúsculas, si es así escribala en minúscula y pruebe de nuevo*");
            palabra="Not found";
        }

        //Mostramos la palabra final
        System.out.println("La palabra en plural sería: "+palabra);
        return palabra;
        
    }
}