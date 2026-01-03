import java.util.Scanner;
public class LinearSearch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Boolean flag = true;
		int key;
		int n;
		System.out.println("Enter a number :");
		n = sc.nextInt();
		System.out.println("Enter array Elements :");
		

		int[] a = new int[n];
		for(int i = 0; i <n; i++){
			a[i] = sc.nextInt();
		}

		System.out.println("Enter a element for search :");
		key = sc.nextInt();
	
		for(int i = 0;i < a.length;i++){
			if(a[i] == key){
				flag = false;
				break;
			}
		}

		if(flag)
			System.out.println(" not Element found");
		else
			System.out.println("Found");
	}
}
			