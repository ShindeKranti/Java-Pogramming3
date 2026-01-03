import java.util.Scanner;
public class Anagram{
	public static void main(String agrs[]){

		Scannner sc = new Scanner(System.in);
		String s1,s2;

		System.out.println("Enter a first String :");
		s1 = sc.nextLine();

		System.out.println("Enetr a second Number :");
		s2 = sc.nextLine();

		s1.replace(" "," ").toLowerCase();
		s2.replace(" "," ").toLowerCase();

		if(s1.length()!=s2.length()){
			System.out.println("not anagram");
			return;
		}

		int count = 0;
		if(int i = 0;i<s1.length;i++){
			char ch = 

		