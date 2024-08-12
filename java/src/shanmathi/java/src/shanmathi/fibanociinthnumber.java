package shanmathi;
import java.util.Scanner;
public class fibanociinthnumber {
	public static void main(String[]args) {
		int a=0,b=0,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the nth fibonacci series value :");
		int n=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			a=b;
			b=c;
			c=a+b;
		}
		System.out.println(c);
	}
}
