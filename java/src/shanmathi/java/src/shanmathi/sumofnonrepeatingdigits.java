package shanmathi;
import java.util.Scanner;
public class sumofnonrepeatingdigits {
	public static void main(String[]args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits: ");
		int n=sc.nextInt();
		char a[]=Integer.toString(n).toCharArray();
		for(int i=0;i<a.length;i++)
		{   
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j])&&(a[i]!='0'))
				{
					a[j]='0';
					count++;
				}
			}
			if(count>0)
			{
				a[i]='0';
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				int num=a[i]-'0';
				sum+=num;
			}
			System.out.println(a[i]);
		}
			System.out.println("Sum of non repeating numbers:  " +sum);
		
	}
}