package shanmathi;
import java.util.Scanner;
public class differencebtwadjacentnoinarray {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b;
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		//int b[]=new int[n];
		for(int i=0;i<n-1;i++) 
		{
				if(a[i]<a[i+1])
				{
					b=a[i+1]-a[i];
					System.out.println(b);
				}
				else
				{
					b=a[i]-a[i+1];
					System.out.println(b);
				}
			}
		}
	}

