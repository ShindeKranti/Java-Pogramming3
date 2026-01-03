import java.util.Scanner;
public class Letter{
	public static void main(String[] args){
		char ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER THE CHAR : ");
	ch = sc.next().charAt(0);
	System.out.println("The character is "+(ch));
	System.out.println("The previous character is "+(char)(ch-1));
	System.out.println("The previous character is "+(char)(ch+1));
	
	
}
}