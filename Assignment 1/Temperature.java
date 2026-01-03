import java.util.Scanner;
public class Temperature{
	public static void main(String args[]){
		float f;
		double c,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a Farhrenheit :");
		f = sc.nextFloat();
		c = 5/9*(f-32);
		k = c+273.15;
		System.out.println("Celcius :"+c);
		System.out.println("Kelvin :"+k);
	}
}
	