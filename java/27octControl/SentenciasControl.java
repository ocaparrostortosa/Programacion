import java.util.Scanner;

public class SentenciasControl{
	//Establecemos un double (constante[FINAL]) público para poder usar el valor de Pi en todo el código
	public static final double PI = 3.1415;
	public static void main(String[] args){
	//Definimos el valor de radio y calculamos el área.
	  double radio = 1.78;
	  
	  // System.out.println("El valor del area es: "+area);
	  	  
	  /** Scanner sc = new Scanner(System.in);
	  System.out.println("Introduce el valor del radio");
	  radio = sc.nextDouble(); */
	  
	  double area = radio * radio * PI;
	  
	  //Estructura de control: Ejecutar el programa si el valor del radio es menor que cero.
	  //IF: Si radio es menor o igual que 0 que haga lo siguiente:
	  if (radio <= 0) {
		  System.out.println("El valor del radio es incorrecto, no se puede ejecutar el programa");
	  } 
	  //Si el valor del radio es positivo y es válido que haga lo siguiente:
	  else {
		  System.out.println("El valor del área es: "+area);
	  }
	}
}
