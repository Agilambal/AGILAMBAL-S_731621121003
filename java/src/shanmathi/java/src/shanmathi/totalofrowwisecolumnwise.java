package shanmathi;
import java.util.Scanner;
public class totalofrowwisecolumnwise {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and column of matrix:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			int rowsum=0;
			for(int j=0;j<m;j++) 
			{
				rowsum+=a[i][j];
			}
			System.out.println("Sum of row"  +rowsum);
		}
		for(int i=0;i<m;i++)
		{
			int colsum=0;
			for(int j=0;j<n;j++)
			{
				colsum+=a[j][i];
			}
			System.out.println("Sum of column"  +colsum);
		}
	}
}
