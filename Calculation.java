import java.util.Scanner;
public class Calculation{
	public static void main(String[] args){
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Addition is:" +(a+b));
		System.out.println("Substraction is:" +(a-b));
		System.out.println("Mul is:" +(a*b));
		System.out.println("Division is:" +(a/b));

	}
}
