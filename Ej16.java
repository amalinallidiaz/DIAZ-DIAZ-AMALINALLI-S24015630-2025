import java.util.Scanner;
public class Ej16{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\n\t---PARES O IMPARES---");
		System.out.print("\n\tIntrouce número: ");
		double num=sc.nextDouble();
		
		if(num % 2 == 0){
			System.out.print("\n\tEL " + String.format("%.0f",num) + "  ES: PAR");
		}else{
			System.out.print("\n\tES IMPAR ");
		}
	}
}