import java.util.Scanner; //Importamos las librerias para poder Scannear la información que introduzca el usuario

//Definimos una clase secundaria que es la que usaremos para crear los objetos.
class Moneda2{
	//Creamos una variable privada llamada moneda
	private int moneda;
	//Creamos una variable publica llamada Moneda2 y le damos el valor n	
	public Moneda2(int n){
		this.moneda=n;
	}
	
	//Definimos la variable int euro
	public int euro(){
		return this.moneda;
	}
	//Definimos la variable double dolar
	public double dolar(){
		return this.moneda*(1.0967); //1.0967 es el valor de 1 euro equivalente a dolares
	}
}


//Creamos la clase principal public Moneda con el main incluido
public class pruebaobjeto{
		public static void main(String[] args){
		
		//Variable que usaremos para poder introducir el número de euros.
		int a;
		//Llamamos a las librerias y llamamos al objeto sc		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de euros: ");
		//A continuacion el usuario le dará una valor a la variable "a" con la siguiente línea de código
		a = sc.nextInt();
		
		//Para poder definir la moneda y mostrarla
		//Creamos el objeto Moneda2 lo llamamos n1 y le damos el valor de a.
		Moneda2 n1 = new Moneda2(a);
		System.out.println("Valor en euros: "+n1.euro());
		System.out.println("Valor en dolares: "+n1.dolar());	
		}
}
