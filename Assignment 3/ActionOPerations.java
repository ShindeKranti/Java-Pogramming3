import java.util.Scanner;
public class ActionOPerations{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int x,y,ch,n;
		System.out.println("Enetr a value :");
		x = sc.nextInt();
		System.out.println("Enter a value :");
		y = sc.nextInt();
		System.out.println("1.Equality : ");
		System.out.println("2.Less Than :");
		System.out.println("3. Quotient and Reminder :");
		System.out.println("4. Range :");
		System.out.println("5. Swap  :");
		
		ch = sc.nextInt();
		switch(ch){
			case 1 :
				if(x==y)
					System.out.println("x and y are equal");
				else
					System.out.println("x and y are not equal");

				break;
			case 2 :
				if(x<y)
					System.out.println("x is less than y");
				else
					System.out.println("x is not less than y");

				break;
			case 3 :
				if(y!=0)
					System.out.println("Quotient is" +(x/y));
				else
					System.out.println("reminder is" +(x%y));
				break;
			case 4 :
				n = sc.nextInt();
				if(n>=x && n<=y || n>=y && n<=x)
					System.out.println("Number lies between x and y");
				else
					System.out.println("Number is not lies between x and y");
				break;
			case 5 :
				int temp = x;
				x = y;
				y = temp;
				System.out.println("After swapping : ");
				System.out.println(" 1st number is " +x);
				System.out.println("2nd Number is " +y);
				break;
			default :
				System.out.println("Invalid");
		}
	}
}

				