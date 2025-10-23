import java.util.Scanner;
public class Ej10{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		double prom;
		System.out.print("Ingresa tu calificación");
		double m1=sc.nextDouble();
		System.out.print("Ingresa calificación de la segunda materia");
		double m2=sc.nextDouble();
		System.out.print("Ingresa tu calificación de la tercera materia");
		double m3=sc.nextDouble();
		
		prom = (m1+m2+m3)/3;
		System.out.print("EL PROMEDIO DE TU CALIFICACION ES:" + String.format("%.1f",prom));
	}
}