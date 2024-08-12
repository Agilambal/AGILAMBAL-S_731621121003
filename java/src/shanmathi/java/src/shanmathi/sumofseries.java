package shanmathi;

import java.util.Scanner;

public class sumofseries {
	public static void main(String[]ags)
	{
		int sum=1,a=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Values:");
		int n=sc.nextInt();
		while(sum<n-1)
		{
			a=(a*a)+a;
			sum+=a;
		}
		System.out.println(sum);


	}

}

 