import java.util.Scanner;
public class PrimeNumber{
	public static void main(String args[]){
		int a,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		n = sc.nextInt();
		for(int i=1;i<100;i++){
			for(int j=1;j<n;j++){
				if(n%i==0){
					count++;
				}
			}
		}
		if(count==2)
			System.out.println("prime number");
		else
			System.out.println("Not prime number");
	}
}

		
				
		