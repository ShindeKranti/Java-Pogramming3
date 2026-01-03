import java.util.Scanner;

public class SalesDiscount {
    public static void main(String args[]) {

        int q1, q2, q3;
        float r1, r2, r3;
        float amount, discount, netAmount;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter quantity of item 1: ");
        q1 = sc.nextInt();
        System.out.print("Enter rate of item 1: ");
        r1 = sc.nextFloat();

        System.out.print("Enter quantity of item 2: ");
        q2 = sc.nextInt();
        System.out.print("Enter rate of item 2: ");
        r2 = sc.nextFloat();

        System.out.print("Enter quantity of item 3: ");
        q3 = sc.nextInt();
        System.out.print("Enter rate of item 3: ");
        r3 = sc.nextFloat();

        amount = (q1 * r1) + (q2 * r2) + (q3 * r3);

        if (amount > 5000) {
            discount = amount * 0.20f;
        }
        else if (amount >= 3000) {
            discount = amount * 0.15f;
        }
        else if (amount >= 1000) {
            discount = amount * 0.08f;
        }
        else {
            discount = 0;
        }

        netAmount = amount - discount;

        System.out.println("Total Sales Amount = " + amount);
        System.out.println("Discount = " + discount);
        System.out.println("Net Amount to Pay = " + netAmount);
    }
}
