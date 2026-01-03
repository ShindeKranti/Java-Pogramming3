import java.util.Scanner;
public class Cylinder{
	public static void main(String[] args){
		float r,h;
		double sarea;
		double volume;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a radius :");
		System.out.println("Enter a height :");
		r = sc.nextFloat();
		h = sc.nextFloat();
		sarea = 2*3.14*r*r+2*3.14*r;
		volume = 3.14*r*r*h;
		System.out.println("Surface area of Cylinder is :"+sarea);
		System.out.println("Volume of cylinder is :"+volume);
	}
}