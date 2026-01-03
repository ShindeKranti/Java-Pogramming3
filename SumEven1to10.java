import java.util.Scanner;
public class SumEven1to10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		for(int i = 1;i<=10;i++){
			if(i % 2==0){
				sum = sum +i;
			}
		}
		System.out.println("Sum of even numbers is :" +sum);
	}
}