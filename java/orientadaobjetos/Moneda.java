//Definimos una clase en la que trabajaremos con el objeto
class Moneda2{
	private double moneda;
		
	public Monedo(int n){
		this.moneda=n;
	}
	
	
	public double euro(){
		return this.moneda;
	}
	public double dolar(){
		return this.moneda*(1.0967); //1.0967 es el valor de 1 euro equivalente a dolares
	}
}
public class Moneda{
		public static void main(String[] args){
			
		Moneda2 n1 = new Moneda2(10);
		System.out.println("Valor en euros (10€): "+n1.euro());
		System.out.println("Valor en dolares: "+n1.dolar());	
		}
}
