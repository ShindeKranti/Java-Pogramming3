import java.util.Scanner;
public class SumXtoY{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);

		int x,y,sum = 0;
	
		System.out.println("Enter a x :");
		x = sc.nextInt();

		System.out.println("Enter a y :");
		y = sc.nextInt();
	
		for(int i = x ; i <= y; i++){
			sum = sum + i;
		}

		System.out.println("Sum is :" +sum);
	}
}
	