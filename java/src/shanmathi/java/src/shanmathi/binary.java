package shanmathi;
import java.util.Scanner;
public class binary {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values:");
		int n=sc.nextInt();
		int a;
		boolean b=true;
		while(n!=0) 
		{
			a=n%10;
			
			if(a==0||a==1)
			{
				b=true;
			}
			else
			{
				b=false;
				break;
			}

		n/=10;
		}
		System.out.println(b);
	}
}
