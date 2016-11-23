public class Ejercicio2 {
	
	public static void main (String args[]) {
	int a = 1;
	double d = 1.0;
		{
			a = 1;
			a = 46 / 9; //A valdrá 46 / 9 = 5
			System.out.println("Valor de a: "+a);
		}
		{
			a = 1;
			a = 46 % 9 + 4 * 4 - 2; // Aquí A valdrá 1(46 % 9) + 16(4*4) -2 = 15
			System.out.println("Valor de a: "+a);
		}
		{
			a = 1;
			a = 45 + 43 % 5 * (23 * 3 % 2); //A valdrá 45 + 3 (43 % 5) * (23 * 1[3 % 2]) = 1173
			System.out.println("Valor de a: "+a);
		}
		{
			a = 1;
			a %= 3 / a + 3; // a = 1173 % 3 / 1173 + 3 = 0 / 1173 + 3 = 3
			System.out.println("Valor de a: "+a);
		}
		{ 
			d = 1.0;
			d= 4 + d * d + 4; // 4 + 1.0 * 1.0 + 4 = 9	
			System.out.println("Valor de d: "+d);
		}
		{ 
			a = 1;
			d = 1.0;
			d += 1.5 * 3 + (++a); // d = 9 + 1.5 * 3 + (10) = 23.5
			System.out.println("Valor de d: "+d);
		}
		{ 
			a = 1;
			d = 1.0;
			d -= 1.5 * 3 + a++; // d= 23.5 - 1.5 * 3 + 23.5++ =  42.5++ = 43.5
			System.out.println("Valor de d: "+d);
		}
	System.out.println("El valor de a es: " + a + " y el valor de b es: " + d);
	}
}		
