package shanmathi;
import java.util.Scanner;
public class automorphic {
	public static void main(String[]args) {
		int a=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
	    a=n*n;
		System.out.println(+a);
		if(a%100==n)
		{
			System.out.println("It is Automorphic");
		}
		else
		{
			System.out.println("It is not Automorphic");
		}
	}
}
