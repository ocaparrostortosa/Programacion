public class Ejercicio1 {
	
	public static void main (String args[]) {
	//Ejercicio 1 de la relacion de ejercicios del tema 3
	//Variable double denominada millas
	double millas = 17;
	//Variable constante double
	final double MILLAS_POR_KILOMETRO = 1_609;
	//Multiplicacion de los valores
	double kilometros = MILLAS_POR_KILOMETRO*millas;
	System.out.println("Número de millas " + millas +", multiplicado por el valor de las millas/km " 
						+ MILLAS_POR_KILOMETRO + " es igual a : " + kilometros);
	}
}

