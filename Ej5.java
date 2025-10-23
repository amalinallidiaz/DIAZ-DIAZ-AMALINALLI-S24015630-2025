import java.util.Scanner;
public class Ej5{	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nIntroduzca los grados que decea convertir: °");
		double grr = sc.nextDouble();
		double FA,ke;
		FA=(1.8*grr)+32;
		ke=grr+273.15;

		System.out.println("\n\tGrados fahrenheit °" + FA);
		System.out.print("\n\t Grados kelvin °" + ke);
			
	}
}