import java.util.Scanner;

public class ValidTime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int h,m,s;
        System.out.print("Enter hour, minute and second: ");
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();

        String result = (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60)
                ? "Time is Valid"
                : "Time is NOT Valid";

	System.out.println(result);

    }
}
