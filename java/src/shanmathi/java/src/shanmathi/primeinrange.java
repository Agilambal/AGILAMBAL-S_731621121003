package shanmathi;
import java.util.Scanner;
public class primeinrange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower range:");
		int n=sc.nextInt();
		System.out.println("Enter the higher range:");
		int m=sc.nextInt();
		for(int i=n;i<=m;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(""+i);
			}
		}
	}
}
