import java.util.Scanner;
public class Array{
	public static void main(String args[]){
	
		int n;	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a N :");
		n = sc.nextInt();
		System.out.println("Array Elements are :");
	
		int[] a = new int[n];// array decleration
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
		}
	
		System.out.println("Given array is :");
		for(int i = 0;i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}