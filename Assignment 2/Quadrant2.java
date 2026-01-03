import java.util.Scanner;

public class Quadrant2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        String result =
            (x == 0 && y == 0) ? "Origin" :
            (x > 0 && y > 0) ? "Quadrant I" :
            (x < 0 && y > 0) ? "Quadrant II" :
            (x < 0 && y < 0) ? "Quadrant III" :
            (x > 0 && y < 0) ? "Quadrant IV" :
            (y == 0) ? "X-axis" :
            "Y-axis";

        System.out.println(result);
    }
}

