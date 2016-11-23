public class Ambito{
	int variableClase = 1;
	//System.out.println(variableClase + "," + variableLocal + "," + variableBloque + "," + variableBloque2);
	public static void main(String[] args){
	int variableLocal = 2;
	//System.out.println(variableClase + "," + variableLocal + "," + variableBloque + "," + variableBloque2);
	{

		int variableBloque = 3;
		{ 
			int variableBloque2 = 4;

	System.out.println(variableClase + "," + variableLocal + "," + variableBloque + "," + variableBloque2);
	}
	}
}
}
