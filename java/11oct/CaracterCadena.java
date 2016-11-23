public class CaracterCadena {
	public static void main(String[] args){
	//declaramos cadenas
	String cadena1 = new String("ésta es la primera cadena");
	String cadena2 = "esta es otra forma de hacer las cadenas";
	//mostramos en pantalla las cadenas con la concatenación
	System.out.println("cadena1: "+cadena1+", cadena2: "+cadena2);
	//declaramos tipos char: son tipos PRIMITIVOS
	char caracter1 = '/';
	char caracter2 = 'a';
	char caracter3 = '~';
	char unicode1 = '\u00A9';
	//mostramos en pantalla el caracter
	System.out.println(caracter1+caracter2+caracter3);
	System.out.println(""+caracter1+caracter2+caracter3);
	//cadenas con caracteres especiales "\
	String cadena3 = "hola \"entre comillas\" hola";
	String cadena4 = "hola usando caracter especial \\ hola";
	//y lo mostramos por pantalla
	String cadena5 = "hola usando caracter especial 'ei' hola";
	String cadena6 = "hola usando caracter unicode 'ei' hola";
	System.out.println(cadena3+"\n"+cadena4+"\n"+cadena5+"\n"+unicode1);
	System.out.println("Mostrar una serie de caracteres como \u00BD \u00BC \u00BE");
}
}
