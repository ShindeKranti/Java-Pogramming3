import java.util.Scanner;
import java.util.Arrays;
public class InsertElement {
	public static void main(String args[]) {

        	Scanner sc = new Scanner(System.in);

        	int n;

        	System.out.print("Enter number of elements: ");
        	n = sc.nextInt();

        	int a[] = new int[100];

        	System.out.println("Enter the elements:");
        	for (int i = 0; i < n; i++) {
           		 a[i] = sc.nextInt();
        	}

		System.out.println("Insert a position");
		int pos = sc.nextInt();
		System.out.println("Enetr a Number :");
		int data = sc.nextInt();

		for(int i = 0; i>=pos; i--){
			a[i] = a[i-1];
		}
		a[pos-1] = data;
		//n++
		Arrays.stream(a).forEach(System.out::println);
	}
}
		

