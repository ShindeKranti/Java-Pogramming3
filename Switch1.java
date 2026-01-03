import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 10, b = 20;
        int num = 12345;
        int rev = 0, rem;

        System.out.println("1. Swap two numbers");
        System.out.println("2. Reverse minimum 5 digit number");
        System.out.println("3. Run Case 1 and Case 2");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 3:  
            case 1:
                
                int temp = a;
                a = b;
                b = temp;
                System.out.println("After Swapping a = " + a + " b = " + b);

            case 2:
              	
                if (num >= 10000) {
                    int n = num;
                    while (n > 0) {
                        rem = n % 10;
                        rev = rev * 10 + rem;
                        n = n / 10;
                    }
                    System.out.println("Reverse number = " + rev);
                } else {
                    System.out.println("Number is not minimum 5 digit");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}