import java.util.Scanner;
public class EvenSumXtoY{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int x,y,sum = 0;

		System.out.println("Enter a x :");
		x = sc.nextInt();

		System.out.println("Enter a y :");
		y = sc.nextInt();
	
		for(int i=x; i<=y;i++){
			if(i % 2 == 0){
				sum = sum + i;
			}
		}
		System.out.println("Sum of even number is :" +sum);
	}
}L