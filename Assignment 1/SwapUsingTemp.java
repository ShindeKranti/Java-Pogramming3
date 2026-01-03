import java.util.Scanner;
public class SwapUsingTemp{
	public static void main(String[] args){
		int a,b,temp;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter a First number :");
		a = sc.nextInt();

		System.out.println("Enetr a Second number :");
		b = sc.nextInt();
		temp = a;
		a = b;
		temp = b;
		System.out.println("Interchanging the value :");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
		