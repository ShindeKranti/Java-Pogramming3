import java.util.Scanner;
public class ASCIIValue {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
       		 char ch;
        	 System.out.print("Enter a character: ");
       		 ch = sc.next().charAt(0);
		 System.out.println("ASCII value of " + ch +" is "+ (int) ch);
    }
}
