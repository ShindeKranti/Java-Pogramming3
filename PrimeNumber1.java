import java.util.Scanner;
public class PrimeNumberSeries{
	public static void main(String args[]){
		int n;
		Boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		n = sc.nextInt();
		if(n == 1)
		{
			System.out.println("Not prime Number:");	
			System.exit(0);
		}
		if(n == 2 || n == 3)
		{
			System.out.println(" prime Number:");	
			System.exit(0);
		}
		if(n%2==0 || n%3==0)
		{
			System.out.println("Not prime Number:");	
			System.exit(0);
		}else{
			for(int i=5;i<=Math.sqrt(n);i+=6)
			{
				if(n%i==0 || n%(i+2)==0)
				{
					flag = false;
					break;			
				}
			}
		if(flag)
			System.out.println("prime Number");
		else
			System.out.println("not prime number");

		}
	}
}

		