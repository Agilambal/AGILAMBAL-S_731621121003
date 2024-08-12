package shanmathi;
import java.util.Scanner;
public class ascendingorderturorfalse {
	public static void main(String[]args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element of array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{	
				if(a[i]<a[j])
				{
				    sum=0;
				}
				else
				{
					sum=1;
				}
			}
		}
			if(sum==0)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
		
	}
}
