import java.util.Scanner;
public class ProfitLoss{
	public static void main(String args[]){
		float cp,sp;
		float profit,loss;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Cost Prise:");
		cp = sc.nextFloat();
		System.out.println("Enter a Selling prise:");
		sp = sc.nextFloat();	
		profit = sp - cp;
		loss = cp - sp;
		if(sp>cp)
		{
			System.out.println("Profit = "+profit);
		}
		else if(sp<cp)
			System.out.println("loss = "+loss);
		else
			System.out.println("No profit no loss");
	}
}
			
		