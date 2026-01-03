import java.util.Scanner;
public class EvenXtoY{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int x,y;

		System.out.println("Enetr a Number of X :");
		x = sc.nextInt();

		System.out.println("Enter a Number of y :");
		y = sc.nextInt();

		for(int i = x;i<=y;i++){
			if(i % 2==0){
				System.out.println(i);
			}	
		}
		
	}
}