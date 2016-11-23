public class ejercicio1{
	public static void main(String[] args){
	String productos;
	productos = "El cliente ha comprado productos a estos precios: ";
	long portatil = 1_000L;
	float raton = 3.12f;
	boolean variableBoolean = true;
	byte variableByte = -120;
	System.out.println("Boolean= " + variableBoolean + ", byte= " + variableByte);
	char euro = '\u20AC';
	System.out.println(productos + "Portátil gamer " + portatil+euro + "; Raton de bola " + raton+euro);
	}
}
