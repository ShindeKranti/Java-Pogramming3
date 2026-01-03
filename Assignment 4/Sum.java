import java.util.Scanner;
public class Sum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int sum=0,i;
		
		for(i = 1;i <= 5;i++){
			sum = sum+i;
		}
		System.out.println("sum of 1 to 5 is : " +sum);
	}
}
		