import java.util.Scanner;
public class Prime1{
	public static void main(String args[]){
		long n,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter number :");
		n = sc.nextLong();
		
		for(int i=1;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==0)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not Prime");
	}
}
