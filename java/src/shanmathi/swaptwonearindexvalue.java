package shanmathi;
import java.util.Scanner;
public class swaptwonearindexvalue {
	public static void main(String[]args)
	{
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i+=2)
		
			{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for(int i=0;i<n;i++) {
		System.out.print(+a[i]);
		}
	}
}
