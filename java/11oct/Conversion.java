public class Conversion{
	public static void main(String[] args){
	//definimos los tipos int y tipo long
	int tipoInt = 2;
	long tipoLong = 1_123;
	tipoInt *= tipoLong; //multiplicamos tipoInt por tipoLong
	//y lo almacenamos en tipoInt
	System.out.println("Valor de la opearción es igual a "+tipoInt);
	//Cambiamos el valor de Long y lo imprimimos
	tipoLong = 3_000_000_000L;
	tipoInt *= tipoLong;
	System.out.println("Valor de la opearción es igual a "+tipoInt);
	//introducimos valores tipo double
	tipoInt = 2;
	double tipoDouble = 2.5E6; //2 por 10 elevado a 6
	//un tipo doble dividido a un tipo int
	tipoDouble /= tipoInt;
	System.out.println("Valor de la operación (double) es igual a "+tipoDouble);
}
}

