import java.util.Scanner;
public class SumWithoutloop{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n,sum=0;

		System.out.println("Enetr a number :");		
		n = sc.nextInt();

		sum = n*(n+1)/2;

		System.out.println("Sum of numbers is :" +sum);
	}
} 