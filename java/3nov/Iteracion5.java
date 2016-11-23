public class Iteracion5{
  public static void main(String[] args){
	//Definimos las variables para el valor de numero y la variable
	//Contador
	int numero = 12;
	int contador;
	
	//Hacemos la llamada al método
	mostrarHaciaAtrasConPasos(numero, 2);
	
  }
  
  //Creamos el método que nos mostrará en saltos de 2 los números
  //hacia abajo a partir del 12
  public static void mostrarHaciaAtrasConPasos(int digito, int pasos){
	 for(int contador=digito; contador>=1;contador-=(pasos))
		System.out.println("Pasando de 2 en 2 hacia abajo ("+digito+") : "+contador);
  
}

}
