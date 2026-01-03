import java.util.Scanner;
public class Number{
	public static void main(String[] args){
		float a,b;
		float am,hm;
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		b = sc.nextFloat();
		am = (a+b)/2;
		hm = hm = (a * b) / (a + b);
		System.out.println("Arithmatic is :"+am);
		System.out.println("Harmonic is :"+hm);
	}
}