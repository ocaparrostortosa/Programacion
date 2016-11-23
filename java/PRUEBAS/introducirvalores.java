import java.util.Scanner;
public class introducirvalores{
	public static void main(String[] args){

	
	int a;
	int b;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el valor de a");
	a = sc.nextInt();
	
	System.out.println("Introduce el valor de b");
	b = sc.nextInt();

	int resultado = (a+b);

	System.out.println("El resultado de la suma es: "+resultado);
  }
}
