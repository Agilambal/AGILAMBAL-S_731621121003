package shanmathi;
import java.util.Scanner;
public class lcmoftwo {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first value:");
		int x=sc.nextInt();
		System.out.println("Enter the second value:");
		int y=sc.nextInt();
		int gcd=1;
		for(int i=1;i<=x && i<=y;i++)
		{ 
			if(x%i==0 && y%i==0)
			{
				gcd=i;
			}
			int lcm=(x*y)/gcd;
			System.out.println(lcm);
		}
	}
}
