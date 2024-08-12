package shanmathi;
import java.util.Scanner;
public class minimaxi {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		System.out.println("Enter tne array element:");
		int s[]=new int[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextInt();
		}
		int temp,minindex=0,maxindex=0;
		int min=s[0];
		int max=s[0];
		for(int i=0;i<n;i++)
		{
			if(min>s[i])
			{
				min=s[i];
				minindex=i;
			}
			if(max<s[i])
			{
				max=s[i];
				maxindex=i;
			}
		}
		System.out.println("Enter the min and max element after swap:");
		temp=s[minindex];
		s[minindex]=s[maxindex];
		s[maxindex]=temp;
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
	}

}
