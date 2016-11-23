public class EjercicioPares{
  public static void main(String[] args){
	int numero = 12;
	int contador;
	for (contador=numero;contador>=1;contador--){
		if(contador % 2 != 0){
			continue;
		}
		System.out.println("Número par: "+contador);
	}
}
}
