import java.util.Scanner;
public class Ej3{
	public static void main(String args[]){	
		double pol;
		Scanner sc= new Scanner(System.in);
		System.out.print("Introuzca su edad: ");
		int edad=sc.nextInt();
		pol=(220-edad)/10;
		System.out.print("SUS PUSACIONES POR MINUTO SON:" + pol);
	}
}