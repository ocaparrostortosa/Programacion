public class Iteracion4{
  public static void main(String[] args){
	int numero = 12;
	int contador;
//Queremos que un bucle nos muestre los números desde 12 hasta 0

	
	for(contador=numero; contador>=1; contador--){
		System.out.println("Contador "+contador);}	
		
	//En este caso se puede omitir las llaves, pero sólo se
	//ejecutará la primera línea tras el for.	
	
	
	//Vamos a trabajar con un método que haga lo mismo.
	//Definir la llamada del método.
	mostrarHaciaAtras(numero);
	
	
  }
  //Creamos el método 
  public static void mostrarHaciaAtras(int digito){
	 for(int contador=digito; contador>=1; contador--){
		System.out.println("Contador "+contador);
  }
  }
  
 
}
