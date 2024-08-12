package shanmathi;
import java.util.Scanner;
public class neonnumber {
	public static void main(String[]args)
	{
		int a,b,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("entre the number: ");
		int n=sc.nextInt();
		a=n*n;
		System.out.println(a);
		while(a>0)
		{
			b=a%10;
			sum+=b;
			a/=10;
			System.out.println(sum);
	    }
		if(n==sum)
		{
			System.out.println("It is Neon number");
		}
		else
		{
			System.out.println("it is not Neon number");
		}
	}
}
