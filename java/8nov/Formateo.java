public class Formateo{
  public static void main(String[] args){
      int numeroEntero = 12;
      float numeroFloat = 12.445566F;

      System.out.printf("El numero entero es %d y el decimal es %.2f%n",numeroEntero ,numeroFloat);

      boolean expresionBoolean = numeroEntero > numeroFloat;
      char variableChar = 'c';

      System.out.printf("La expresion %d < %f vale %b y el caracter vale %c%n",
                        numeroEntero ,numeroFloat, numeroEntero < numeroFloat, variableChar);

      for(int i=0; i<15;i++)
        System.out.printf("%2d/3 vale %6.3f%n",i,i/3.0);
  }
}