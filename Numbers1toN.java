import java.util.Scanner;
public class Numbers1toN{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int i,n;
		System.out.println("Enter a Number :");
		n = sc.nextInt();

		for(i = 1;i <= n;i++){
			System.out.println(i);
		}
	}
}