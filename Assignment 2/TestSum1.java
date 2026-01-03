import java.util.Scanner;
public class TestSum1{
	public static void main(String args[]){
		int n,sum=0;
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		n = sc.nextInt();
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum is :"+sum);
	}
}	
		
