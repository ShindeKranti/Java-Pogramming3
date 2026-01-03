import java.util.Arrays;
import java.util.Scanner;
public class MaxArray{
	public static void main(String args[]){
	
		int n;	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a N :");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
	
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("Max is :"+max);

                //Arrays.stream[arr].forEach(System.out::println); using forEach loop 
	}
}