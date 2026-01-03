import java.util.Scanner;

public class ValidTime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int h,m,s;
        System.out.print("Enter hour, minute and second: ");
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();

        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            System.out.println("Time is Valid");
        } else {
            System.out.println("Time is NOT Valid");
        }
    }
}
