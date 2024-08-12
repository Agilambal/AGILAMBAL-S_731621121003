import java.util.Scanner;

public class twoDarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
			
			int[][] k= new int[n][n];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
				k[i][j]=sc.nextInt();
				}
			}
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
				
					System.out.print(k[i][j]+" ");
					}
					System.out.println();
				
			}
	}

}
