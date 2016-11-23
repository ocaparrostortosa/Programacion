/* Vamos a realizar un código que muestre las tablas de multiplicar
de un número determinado y sus anteriores*/
public class TablasMultiplicar{
  public static void main(String[] args){
      //Definimos la ultima tabla que queremos que se muestre
      int numero=3;
      //Hacemos una llamada al método
      devolverTablaMultiplicar(numero);
  }

  //Creamos el método
  public static void devolverTablaMultiplicar(int tabla){
      //Definimos el primer bucle que nos sumará 1 al contador hasta que este equivalga
      //a tabla y nos realizará el bucle anidado
      for(int contador=1;contador<=tabla;contador++){
          //En primer lugar mostramos la tabla que se va ejecutar y mostrar posteriormente
        System.out.println("======Tabla de multiplicar del "+contador);
        //Tras mostrar el número de la tabla, ejecutamos el bucle que nos multiplicará desde el 1 
        //hasta el 10, como si de una tabla de multiplicar se tratase.
        for(int contador2=1;contador2<=10;contador2++)
         System.out.println(contador+" x "+contador2+" = "+(contador2*contador));
      }
  }
}