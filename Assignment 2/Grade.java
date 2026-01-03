import java.util.Scanner;
public class Grade{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int s1,s2,s3,total=0;
		float avg;
		System.out.println("Enter a marks of sub1 = ");
		s1 = sc.nextInt();
		System.out.println("Enter a marks of sub2 = ");
		s2 = sc.nextInt();
		System.out.println("Enter a marks of sub3 = ");
		s3 = sc.nextInt();
		total = s1+s2+s3;
		System.out.println("total marks of three subject is :" +total);
		avg = total/3;
		System.out.println("Average of three subject is :" +avg);
		if (avg > 60) 
			System.out.println("Calss I");
		else if (avg > 50)
			System.out.println("class II");
		else if (avg > 45) 
			System.out.println("Class III");
		else
			System.out.println("Fail");
		}
}

		