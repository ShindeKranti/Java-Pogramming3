import java.util.Scanner;
public class Printxtoy{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int x,y,i;
		
		System.out.println("Enter a X ");
		x = sc.nextInt();
		System.out.println("Enter a Y ");
		y = sc.nextInt();

		for(i = x;i <=y;i++){
			System.out.println(i );
		}
	}
}
	
	