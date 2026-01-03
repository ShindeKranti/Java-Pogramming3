import java.util.Scanner;
public class TestSwtich{
	public static void main(String args[]){
		int a,b;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Eq:");
		a = sc.nextInt();
		op = sc.next().charAt(0);
		b = sc.nextInt();
		switch(op){
		case '+' : System.out.println(a+" "+op+" "+" "+b+" = "+(a+b));
				break;
		case '-' : System.out.println(a+" "+op+" "+" "+b+" = "+(a-b));
				break;
		case '*' : System.out.println(a+" "+op+" "+" "+b+" = "+(a*b));
				break;
		case '/' : System.out.println(a+" "+op+" "+" "+b+" = "+(a/b));
				break;
		default:
			   System.out.println("Invalid operation!!");
		}
	}
}