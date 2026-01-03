import java.util.Scanner;
public class Switch{
	public static void main(String args[]){
		char ch = 'B';
		switch (ch){
			default : System.out.println("Hello");
				break;
			case 2 : System.out.println("hi");
			case 'B' : System.out.println("Rs");
			case 'c' : System.out.println("Pun");
		}
	}
}