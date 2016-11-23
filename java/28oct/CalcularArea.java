public class CalcularArea{
	public static final double PI = 3.1415;
  public static void main(String[] args){
	//Definir el valor del radio de un círculo.
	double radius = -1;
	//Comprobar que dicho radio es positivo.
	if (radius > 0){
		//Llamamos a un método que se encargue de calcular el área.
		double area = calcularSuperficie(radius);
		System.out.println("El valor del área es: "+area);
	}
	else if (radius < 0){
		System.out.println("El valor del radio es negativo y por lo tanto no computable");
		System.out.println("El valor del radio "+radius+" será computable al ser positivo "+(radius*(-1)));
		double area = calcularSuperficie(radius*(-1));
		System.out.println("Valor del área con radio positivo es: "+area);
	}
	 else {
		System.out.println("El valor del radio no es correcto, ya que vale 0.");
	}
		
	
  }
  //Definimos el método en este nivel.
  //Éste método calcula el área de un círculo.
  public static double calcularSuperficie(double radio){
	  return radio*radio*PI;
	  
  }
}
