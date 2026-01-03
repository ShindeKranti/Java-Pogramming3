import java.util.Scanner;
public class HelloN{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int n,i;
		System.out.println("Enetr a Number :");
		n = sc.nextInt();

		for(i = 1;i <= n;i++){
			System.out.print("hello ");
		}
	}
}
		
		