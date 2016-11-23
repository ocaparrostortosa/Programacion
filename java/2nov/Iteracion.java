//multiplicar los n primeros numeros
//multiplicar = 1 * 2 * 3 * 4 *...* n
public class Iteracion{
  public static void main(String[] args){
	int numero = 10;
	int multiplicar = 1;
	int contador = 0;
	int resultado;
	//usamos un bucle de tipo dowhile
	if (numero == 0){
		System.out.println("La multiplicacion de los "+contador+" primeros numeros vale: 0");
	}
	else {
		do{
			contador++;
			resultado = (multiplicar * contador);		
			System.out.println("Multiplicar "+multiplicar+" por "+contador+" que es igual a= "+resultado);
			multiplicar *= contador;
		} while (contador < numero);
		System.out.println("La multiplicacion de los "+contador+" primeros numeros vale: "+resultado);
	}
}
}
