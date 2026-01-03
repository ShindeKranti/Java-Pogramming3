import java.util.Scanner;

public class Quadrant1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int x,y;
        System.out.print("Enter x coordinate: ");
        x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        y = sc.nextInt();

        if (x == 0 && y == 0)
            System.out.println("Point lies at Origin");
        else if (x > 0 && y > 0)
            System.out.println("Point lies in Quadrant I");
        else if (x < 0 && y > 0)
            System.out.println("Point lies in Quadrant II");
        else if (x < 0 && y < 0)
            System.out.println("Point lies in Quadrant III");
        else if (x > 0 && y < 0)
            System.out.println("Point lies in Quadrant IV");
        else if (y == 0)
            System.out.println("Point lies on X-axis");
        else
            System.out.println("Point lies on Y-axis");
    }
}
