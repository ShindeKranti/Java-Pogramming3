import java.util.Scanner;
public class Sum100to150{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int sum=0,i;
		
		for(i = 100;i <= 150;i++){
			sum = sum+i;
		}
		System.out.println("sum of 1 to 5 is : " +sum);
	}
}
		