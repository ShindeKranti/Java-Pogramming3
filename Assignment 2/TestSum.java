import java.util.Scanner;
public class TestSum{
	public static void main(String args[]){
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		n = sc.nextInt();
		for(int i=1;i<=n;i++){
			sum=sum+i;
			}
		System.out.println("Sum is :"+sum);
	}
}	
		
