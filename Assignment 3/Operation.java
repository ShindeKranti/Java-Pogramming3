import java.util.Scanner;
public class Operation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int a,b,ch;
		System.out.print("Enetr no :");
		a = sc.nextInt();
		System.out.print("Enter no :");
		b = sc.nextInt();
		System.out.println("1.Addition :");
		System.out.println("2.Substraction :");
		System.out.println("3.Multiplocation :");
		System.out.println("4.Division :");

		ch = sc.nextInt	();

		switch (ch){
		case 1 :
			System.out.println("Addition is :" +(a+b));
			break;
		case 2 :
			System.out.println("Substractio is :" +(a-b));
			break;
		case 3 :
			System.out.println("Multiplication is :" +(a*b));
			break;
		case 4 : 
			System.out.println("Division is :" +(a/b));	
			break;
		default:
			System.out.println("Invalid ");
		}
	}
}