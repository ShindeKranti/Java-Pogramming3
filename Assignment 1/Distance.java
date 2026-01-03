import java.util.Scanner;
public class Distance{
	public static void main(String args[]){
		double x1,x2,y1,y2,distance;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinates of X:");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		System.out.println("Enter coordinates of y:");
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		distance = Math.sqrt((x2 - x1) * (x2 - x1) +
                             (y2 - y1) * (y2 - y1));
      		System.out.println("Distance between two points = " + distance);
    }
}

		


















