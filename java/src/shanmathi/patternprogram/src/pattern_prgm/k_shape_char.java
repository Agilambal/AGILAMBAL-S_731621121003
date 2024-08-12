package pattern_prgm;

import java.util.Scanner;

public class k_shape_char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n*2;i++) {
			for(int j=1;j<=n;j++) {
				if( i+j<=n+1 || (i>n && (i-j>=n)))
				System.out.print((char)(64+j)+" ");
				else 
					System.out.print(" ");
			}
			
			System.out.println();
			}
			
	}
}
