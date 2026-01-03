import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int a,b,c;
        System.out.print("Enter three sides of triangle: ");
         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangle is Valid");
        } else {
            System.out.println("Triangle is NOT Valid");
        }
    }
}
