import java.util.Scanner;
public class Ej6{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nIntroduce la cantidad de hombres en el grupo: ");
		double h=sc.nextDouble();
		System.out.print("\nIntroduce la cantidad de mujeres en el grupo: ");
		double m=sc.nextDouble();
		double sum,p1,p2;
		sum=h+m; 
		p1=(h*100)/sum;
		p2=(m*100)/sum;
		System.out.print("El procentaje de hombres es: " + String.format("%.0f",p1) + "%" + "\nEl porentaje de mujeres es: " + String.format("%.0f",p2) + "%");
	}
}