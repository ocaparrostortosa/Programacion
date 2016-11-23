/** Clase que nos permite la conversión de unicades
 * @author Oscar 
 * @version 1.0*/

public class Unidades{
	/** Definimos los métodos de tipo double poque podrá existir decimales. Convertir de libras a kilogramos.
	@param masa que es el valor a convertir
	@return kilogramos de la masa */
	public static double deLibrasAKilogramos (double masa){
		return masa * 0.45;
	}
	/** Definimos otro metodo para pies a metros.
	 * @param longitud que es el valor a convertir
	 * @return metros de la longitud */
	public static double dePiesAMetros (double longitud){
		return longitud * 0.3048;
	}
	/** Definimos otro metodo para galones a litros.
	 * @param volumen que es el valor a convertir
	 * @return litros del volumene */
	public static double deGalonesALitros(double volumen){
		return volumen * 3.78;
	}
	
	
	public static void main(String[] args){
	int masa = 25;
	int longitud = 12;
	double volumen = 3.5;
	double convertirMasa = deLibrasAKilogramos(masa);
	double convertirLongitud = dePiesAMetros(longitud);
	double convertirVolumen = deGalonesALitros(volumen);
	System.out.println("Masa : "+masa+" kg, "+convertirMasa+" libras");
	System.out.println("Longitud : "+longitud+" metros, "+convertirLongitud+" pies");
	System.out.println("Volumen : "+volumen+" litros, "+convertirVolumen+" Galones");
    }
}
