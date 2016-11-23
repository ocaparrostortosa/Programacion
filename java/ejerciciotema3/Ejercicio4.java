public class Ejercicio4{
	public static void main(String[] args){
	  System.out.println("Si hoy es lunes, ¿que día de la semana será dentro de 100 días?");
	  int dias = 100;
	  int lunes = 0;
	  int semana = 7;
	  System.out.println("Lunes tiene el valor de "+lunes+" y si le sumamos "+dias+" dias, contando con que la semana tiene "+semana+" días, el cociente de la división serán el número de semanas y el resto dará los días de la siguiente semana por lo que:\n");
	  System.out.println("Lunes valdrá 0, Martes valdrá 1, Miercoles = 2, Jueves = 3, Viernes = 4, Sábado = 5 y Domingo = 6\n");
	  System.out.println("Dentro de diez días será el día "+(100%7));
}
}
