public class ControlBucle{
  public static void main(String[] args){
  //Definimos las variables, tanto la final como las que van a ir variando con el código.
    int numerofinal = 5;
    int contador    = 1;
    int suma        = 0;
	
	while (contador <= numerofinal){
		//Código que se repite
		System.out.println(contador+". "+"Al principio del contador el valor del contador es "+contador+" y la suma es "+suma);
		suma += contador;
		contador++;
		System.out.println("Al final del contador el valor del contador es "+contador+" y la suma es "+suma);
	}
	System.out.println("La suma de los "+numerofinal+" primeros números vale: "+suma);
}
}
