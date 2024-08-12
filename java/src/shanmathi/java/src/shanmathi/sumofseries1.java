package shanmathi;
import java.util.Scanner;
public class sumofseries1 {
	public static void main(String[]args) {
		int m,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			 m=1;
			for(int j=1;j<=i;j++)
			{
				m*=i;
			}
			sum+=m;
		}
		System.out.println(sum);
	}
}
