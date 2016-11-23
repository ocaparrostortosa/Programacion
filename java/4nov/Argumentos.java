public class Argumentos{
  public static void main(String[] args){
      //Aprendemos a definir un valor para algunos argumentos,
      //El primer argumento deberá siempre inciarse por 0.
      System.out.println("Argumento 1: "+args[0]);
      System.out.println("Argumento 2: "+args[1]);
      int numero = Integer.parseInt(args[0]);
      int numero2 = Integer.parseInt(args[1]);
      //Al definir los argumentos, estos son de tipo string por lo que no se 
      //podran realizar operaciones aritmeticas con dichas variables.
      System.out.println("Multiplicacion: "+(numero*numero2));
  }
}