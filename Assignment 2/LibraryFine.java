import java.util.Scanner;

public class LibraryFine {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int days;
        int fine;

        System.out.print("Enter number of days the book is late: ");
        days = sc.nextInt();

        // Calculate fine based on days
        if (days < 5) {
            fine = days * 2;
        } 
        else if (days <= 10) {
            fine = days * 5;
        } 
        else {
            fine = days * 10;
        }

        System.out.println("The fine is Rs: " + fine);
    }
}
