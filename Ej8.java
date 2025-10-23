import java.util.Scanner;
public class Ej8{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("\n\tIntroduzca la cantidad de dinero que necesita depositar $");
		double money=sc.nextDouble();
		double porc;
		porc= (2*money)/100;
		System.out.print("\n\tEl crecimiento de su dinero es de " + String.format("%.0f",money) + " pesos " + " por el 2%");
	}
}