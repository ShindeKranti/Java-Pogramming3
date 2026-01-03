import java.util.Scanner;
public class Velocity{
	public static void main(String[] args){
		float u,a,t;
		float v,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a velocity,acclersation and time :");
		u = sc.nextFloat();
		a = sc.nextFloat();
		t = sc.nextFloat();
		v = u+a*t;
		s = u+a*t*t;
		System.out.println("velocity is :"+v);
		System.out.println("Distance is :"+s);
	}
}