import java.util.Scanner;

public class Ej13{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("RESOLVER AX^2 + BX + C = 0");
		System.out.print("Ingresa A: ");
		double a = sc.nextDouble();
		System.out.print("Ingresa B: ");
		double b = sc.nextDouble();
		System.out.print("Ingresa C: ");
		double c = sc.nextDouble();
		
		if (a == 0){
			System.out.println("\nERROR: A es 0. La ecuacion no es cuadratica.");
		}else{
			double d = b*(b - 4)*a*c;
			if (d < 0){
				System.out.println("\nERROR: Raices imaginarias.");
			}else{
				double r1 = (-b + Math.sqrt(d)) / (2 * a);
				
				if (d == 0){
					System.out.println("\nRAIZ REAL UNICA:");
					System.out.println("X: " + r1);
				}else{
					double r2 = (-b - Math.sqrt(d)) / (2 * a);
					
					System.out.println("\nRAICES REALES:");
					System.out.println("X1: " + r1);
					System.out.println("X2: " + r2);
				}
			}
		}
	}
}