import java.util.Scanner;
public class Perfect{
	public static void main(String args[]){
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		n = sc.nextInt();
		for(int i=1;i<=n/2;i++)
		{
		 	if(n%i==0)
				sum=sum+i;
		}
		
		if(sum==n)
			System.out.println("Number is perfect");
		else 
			System.out.println("Number is not perfect");
	}
}	
		
