import java.util.Scanner;
public class Reverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int temp;
		int n;
		System.out.println("Enter a number :");
		n = sc.nextInt();
		System.out.println("Enter array Elements :");
		

		int[] a = new int[n];
		for(int i = 0; i <n; i++){
			a[i] = sc.nextInt();
		}

		for(int i = 0;i < n/2 ;i++){
			temp = a[i];
			a[i] = a[n-i-1];
			a[n-i-1] = temp;
		}

		System.out.println("Reverse an array is :");
		
		for(int i = 0; i < a.length;i++){
			System.out.println(a[i]);
		}
	}
}

		
