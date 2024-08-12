package shanmathi;
import java.util.Scanner;
public class subarrayindexsum {
	public static void main(String[]args) {
		int b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Start index:");
		int x=sc.nextInt();
		System.out.println("End index:");
		int y=sc.nextInt();
		for(int i=x;i<=y;i++)
		{
		    	b+=a[i];
		}
		System.out.println(b);
	}
}
