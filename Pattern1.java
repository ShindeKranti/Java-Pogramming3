import java.util.Scanner;
public class Pattern1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int i,j,n,k=1;
		System.out.println("Enter a number ");
		n = sc.nextInt();
		
		for(i=0;i<n;i++){
			for(j=0;j<i;j++){
				System.out.print("k++");
			}
		System.out.println();
		}
	}
}