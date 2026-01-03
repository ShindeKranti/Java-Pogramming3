import java.util.Scanner;
public class SumEven1toN{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	
		int n , sum = 0;
		System.out.println("enter a n Number :");
		n = sc.nextInt();

		for(int i = 1;i<=n;i++){
			if(i % 2 == 0){
				sum = sum + i;
			}
		}
		System.out.println("Sum of Even number is :" +sum);
	}
}