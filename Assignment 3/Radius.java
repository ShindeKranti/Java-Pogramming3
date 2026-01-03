import java.util.Scanner;

public class Radius{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	int ch;
	double r,area,circumference,volume;

        System.out.print("Enter radius: ");
        r = sc.nextDouble();

        System.out.println("1. Area of Circle");
        System.out.println("2. Circumference of Circle");
        System.out.println("3. Volume of Sphere");
        System.out.print("Enter your choice: ");

        ch = sc.nextInt();

        switch (ch) {
            case 1:
                   area = 3.14 * r * r;
                   System.out.println("Area of Circle = " + area);
                   break;

            case 2:
                   circumference = 2 * 3.14 * r;
                   System.out.println("Circumference of Circle = " + circumference);
                   break;

            case 3:
                   volume = (4.0 / 3.0) * 3.14 * r * r * r;
                   System.out.println("Volume of Sphere = " + volume);
                   break;

            default:
                   System.out.println("Invalid Choice");
        }
    }
}