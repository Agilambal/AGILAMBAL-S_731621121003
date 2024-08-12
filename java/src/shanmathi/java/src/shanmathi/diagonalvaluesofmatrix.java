package shanmathi;
import java.util.Scanner;
public class diagonalvaluesofmatrix {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row in matrix");
		int n=sc.nextInt();
		System.out.println("Enter the number of column in matrix");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		System.out.println("Enter the element of matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i!=j)
				{
					a[i][j]=0;
				}
			}
		}
		System.out.println("Diagonal Matrix:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
