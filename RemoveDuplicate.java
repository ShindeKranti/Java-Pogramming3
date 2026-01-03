import java.util.Scanner;
public class RemoveDuplicate  {
	public static void main(String args[]) {

        	Scanner sc = new Scanner(System.in);

        	int n;

        	System.out.print("Enter Array elements: ");
        	n = sc.nextInt();

        	int a[] = new int[10];

        	System.out.println("Enter the elements:");
        	for (int i = 0; i < n; i++) {
           		 a[i] = sc.nextInt();
        	}
		System.out.println("Enetr a Number :");
		int data = sc.nextInt();
		
		for(int i = 0;i<n;i++){
			if(a[i] == data){
				for(int j = i;j<n-1;j++)
					a[j] = a[j+1];
				n--;
				i--;
				
			}
		}
		 System.out.println("Array after deletion:");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }

	}
}

 