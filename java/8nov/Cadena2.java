//Ejercicio 1 sobre API String
public class Cadena2{
  public static void main(String[] args){
      String cadenaEjemplo = "Hola mundillo";

      //Ejemplo del uso del método contains.
          //contains compara dos string, si el primer string contiene el segundo string devuelve true,
          //si no lo contiene, cambia la palabra o algún caracter, da false. (SI es casesensitive).
      System.out.println("==================Contains=================");
      String cadenaBuscar1 = "Hola";
      String cadenaBuscar2 = "hola";
          //Println
        System.out.println("=================Println");
        System.out.println(cadenaEjemplo.contains(cadenaBuscar1));
        System.out.println(cadenaEjemplo.contains(cadenaBuscar2));

          //Printf
        System.out.println("=================Printf");
        System.out.printf("¿ %s contiene %s ? %b\n",cadenaEjemplo,cadenaBuscar1,cadenaEjemplo.contains(cadenaBuscar1));
        System.out.printf("¿ %s contiene %s ? %b\n",cadenaEjemplo,cadenaBuscar2,cadenaEjemplo.contains(cadenaBuscar2));
      
      //Ejemplo del uso del método endsWith
          //endsWith compara dos string, si el primer string acaba con el valor del segundo string 
          //devuelve true,
          //si no acaba con el segundo string, cambia la palabra o algún caracter, 
          //da false. (SI es casesensitive).
      System.out.println("==================endsWith=================");
      String endsWith1 = "mundillo";
      String endsWith2 = "mundo";
          //Printf
        System.out.println("=================Printf");
        System.out.printf("¿ %s acaba en %s ? %b\n",cadenaEjemplo,endsWith1,cadenaEjemplo.endsWith(endsWith1));
        System.out.printf("¿ %s acaba en %s ? %b\n",cadenaEjemplo,endsWith2,cadenaEjemplo.endsWith(endsWith2));

      //Ejemplo del uso del método equalsIgnoreCase
          //equalsIgnoreCase compara dos string, si son idénticos (no es casesensitive) devuelve true,
          //si no lo son, cambia la longitud o algún caracter, da false.
      System.out.println("==================equalsIgnoreCase=================");
      String equalsIgnoreCase1 = "Hola mundillo";
      String equalsIgnoreCase2 = "Hola Mundillo.";
      String equalsIgnoreCase3 = "Hola Mundillo";
          //Printf
        System.out.println("=================Printf");
        System.out.printf("¿ %s es igual a %s ? %b\n",cadenaEjemplo,equalsIgnoreCase1,cadenaEjemplo.equalsIgnoreCase(equalsIgnoreCase1));
        System.out.printf("¿ %s es igual a %s ? %b\n",cadenaEjemplo,equalsIgnoreCase2,cadenaEjemplo.equalsIgnoreCase(equalsIgnoreCase2));
        System.out.printf("¿ %s es igual a %s ? %b\n",cadenaEjemplo,equalsIgnoreCase3,cadenaEjemplo.equalsIgnoreCase(equalsIgnoreCase3));

      //Ejemplo del uso del método isEmpty
          //itsEmpty lee el string, si su longitud es 0 devuelve true,
          //si dicha cadena contiene algun caracter, devuelve false.
      System.out.println("==================isEmpty=================");
      String cadenaVacia = "";
      String isEmpty1 = "Hola mundillo";
      String isEmpty2 = "";
          //Printf
        System.out.println("=================Printf");
        System.out.printf("¿ '%s'' tiene un valor '%s'(longitud 0) ? %b\n",isEmpty1,cadenaVacia,isEmpty1.isEmpty());
        System.out.printf("¿ '%s'' tiene un valor '%s' (longitud 0)? %b\n",isEmpty2,cadenaVacia,isEmpty2.isEmpty());
        

  }
  
}