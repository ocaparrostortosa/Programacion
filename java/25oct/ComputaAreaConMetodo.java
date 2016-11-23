public class ComputaAreaConMetodo{
  public static final double PI = 3.14; //Visible en todo el código
  public static void main(String[] args){
	  //codigo del metodo main
	  //hacemos la llamada al metodo
	  double area = calcularAreaCirculo(2.5);
	  System.out.println("El valor del área con radio 2.5: "+area);
	  System.out.println("El valor del área con readio 5.7: "+calcularAreaCirculo(5.7));
	  imprimirAreaCirculo(8.8);
	  String resultado = devolverAreaCirculo(7.1);
	  System.out.println(resultado);
  }
  
  //Definimos el método. La información entre paréntesis equivale al double are de calcularAreaCirculo del main
  public static double calcularAreaCirculo(double radio){
	//codigo del metodo calcularAreaCirculo
	return radio * radio * PI;
  }
  
  //definimos otro método (VOID no devuelve valores, por eso imprimimos en la misma clase y no llamamos al metodo en main).
  public static void imprimirAreaCirculo(double radio){
	  //codigo del segundo metodo
	  System.out.println("El area vale: "+ radio*radio*PI);
  }
  //y otra forma de hacerlo definiendo una cadena String.
  public static String devolverAreaCirculo(double radio){
	  return "El cálculo del area del circulo de radio " + radio + " vale " + calcularAreaCirculo(radio);
  }
}
