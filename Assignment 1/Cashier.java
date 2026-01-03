import java.util.Scanner;
public class Cashier{
	public static void main(String[] args){
		int amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount to withdrawn: ");
		amt = sc.nextInt();
		int note10,note5,note1;
		note10 = amt / 10;
		amt = amt % 10;
		note5 = amt / 5;
		amt = amt % 5;
		note1 = amt;
		System.out.println("10 Rupees = "+note10);
		System.out.println("5 Rupees = "+note5);
		System.out.println("1 Rupees = "+note1);
	}
}


