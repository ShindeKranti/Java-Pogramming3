import java.util.Scanner;
public class UniqueElements {
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
		
		for(int k = 0; k<n; k++){
			for(int i=k+1; i<n;i++){
				if(a[i] == a[k]){
				for(int j = i;j<n-1;j++)
					a[j] = a[j+1];
				n--;
				i--;
				
			}}
		}
		 System.out.println("unique elements:");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }

	}
}

 