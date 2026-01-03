import java.util.Scanner;
public class Sum1toN{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n,sum = 0;

		System.out.println("Enetre a number :");
		n = sc.nextInt();

		for(int i = 0 ; i < n ;i++){
			sum = sum + i;
		}
		
		System.out.println("Sum of numbers is :" +sum);
	}
}