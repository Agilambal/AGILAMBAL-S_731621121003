package shanmathi;
import java.util.Scanner;
public class sumofoddindexsumofevenindex {
	public static void main(String[]args) {
		int count=0,sumeven=0,sumodd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Element of Array:");
		for(int i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				 if(a[i]%2==0)
				 {
					 sumeven+=a[i];
				 }
			}
		}
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				if(a[i]%2!=0)
				{
					sumodd+=a[i];
				}
			}
		}
		System.out.println("Sum of the even index with even values:"  +sumeven);
		System.out.println("Sum of the odd index with odd values:"  +sumodd);
	}
}
