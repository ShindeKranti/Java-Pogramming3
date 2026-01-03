import java.util.Scanner;
public class Perfect1{
	public static void main(String args[]){
		int n,sum=0;
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		n = sc.nextInt();
		while(i<=n/2)
		{
			if(n%i==0)
			{
				sum=sum+i;
				i++;
			}
		}
		if(sum==0)
			System.out.println("Number is perfect");
		else
			System.out.println("Number is not perfect");
	}
}	
