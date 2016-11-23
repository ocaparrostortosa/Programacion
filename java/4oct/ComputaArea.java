/** Este programa calcula el área de un círculo dado su radio*/

public class ComputaArea {
	public static void main(String[] args){
	//declaramos las variables
	//de tipo doble porque son decimales
	double radio; //nombres de variables legibles
	double area;
	//damos valor a la variable radio
	radio = 5.7;
	//procedemos a la realización del cálculo del área
	area = radio * radio * 3.14;
	System.out.print("El radio del círculo es: ");
	System.out.println(radio);
	System.out.print("El area del círculo es: ");
	System.out.println(area);

	}
}
