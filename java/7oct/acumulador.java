public class acumulador{
	public static void main(String[] args){
	int variable = 0;
	System.out.println("Al incrementarle un valor al final a "+variable+" el resultado sería "+variable++ + "pero se guarda el valor:" + variable);
	System.out.println("Al incrementarle un valor al principio a "+variable+" el valor sería "+ ++variable + "pero se guarda el valor: " + variable);
	//operaciones
	int x = 10;
	int y = 3;
	System.out.println("El resto de la división " + x +  " entre " + y +  " es: " + (x%=y));
	
	x = 10;
	y = 3;
	System.out.println("El resto de " + x +  " entre " + y +  " es: " + (x-=y));
	
	x = 10;
	y = 3;
	System.out.println("La \u0022 multipliacion \u0022 to guapa " + x +  " entre " + y +  " es: " + (x*=y));
	
	}
} 
