import java.util.Scanner;
public class Circle{
	public static void main(String args[]){
		double radius;
		double area;
		double circumference;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Radius of circle :");
		radius = sc.nextDouble();
		area = 3.14*radius*radius;
		circumference = 2*3.14*radius;
		System.out.println("Area = "+area);
		System.out.println("Circuference = "+circumference);
	}
}
		