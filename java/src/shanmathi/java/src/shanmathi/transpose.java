package shanmathi;
public class transpose {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Before transpose the matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("After Transpose matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}	
		