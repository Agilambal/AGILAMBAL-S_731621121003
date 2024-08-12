package shanmathi;
import java.util.Scanner;
public class sorting {
	public static void main(String[]args)
	{
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("enter the array element:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=a[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(+a[i]);
		}
	}

}
}

