import java.util.Scanner;
public class Even1to10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int i;
		for(i = 1; i <= 10 ; i++){
			if(i%2==0){
				System.out.println(i + "even");
			}
			else{
				System.out.println(i + "odd");
			}
		}
	}
}