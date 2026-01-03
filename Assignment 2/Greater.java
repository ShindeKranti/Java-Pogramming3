import java.util.Scanner;
public class Greater{
	public static void main(String args[]){
		int a,b,c;
		Scanner sc = new Scanner(System.in);	
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		/*if(c>b && c>a)
		System.out.println("Max is :"+c);
		else if(b>c && b>a)
		System.out.println("Max is :"+b);
		else
		System.out.println("Max is :"+a);
		if(a>a)
			b=a;
		if(c>b)
			b=c;
		System.out.println("Max is :"+b);*/
		b = a>b?a:b;
		b = c>b?c:b;
		System.out.println("Max is :"+b	);

	}
}