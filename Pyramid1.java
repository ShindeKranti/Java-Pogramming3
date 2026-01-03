import java.util.Scanner;

public class Pyramid1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, i, j;
        int a = 1;
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();   // number of rows

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= 3; j++) {
                System.out.print(a + " ");
                if (i % 2 != 0)
                    a++;
                else
                    a--;
            }

            System.out.println();

            // After even row, adjust a to next starting number
            if (i % 2 == 0)
                a += 4;  // 3 (columns) + 1
        }
    }
}
