import java.util.Scanner;
public class Ej17{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\n\tIntroduce un número:");
		double num=sc.nextDouble();
		
		if(num / num == 1 || num / 1 == num){
			System.out.print("\n\t" + String.format("%.0f",num) + " es número primo");
		
		}else{
			System.out.print("\n\t" + num + " No es un número primo");
		}
	}
}