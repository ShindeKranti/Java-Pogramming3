import java.util.Scanner;
public class Cuboid{
	public static void main(String[] agrs){
		float l,b,h;
		double sarea,volume;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length,breath,height :");
		l = sc.nextFloat();
		b = sc.nextFloat();
		h = sc.nextFloat();
		sarea = 2*(l*b+l*h+b*h);
		volume = 1*b*h;
		System.out.println("Surface areas is :"+sarea);
		System.out.println("Vloume is :"+volume);
	}
}