import java.util.Scanner;
public class Pyramid{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int i,j;
		//stem.out.println("Enter a Number ");
		//n = sc.nextInt();

		for(i = 1;i <=5;i++){
				for(j = 1;j <= i;j++){
					System.out.print("* ");
				}
		System.out.println();
		}
	}
}

