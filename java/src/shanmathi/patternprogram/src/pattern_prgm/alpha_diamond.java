package pattern_prgm;

import java.util.Scanner;

public class alpha_diamond {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<n*2;j++) {
				if((i<=n && i+j==n+1 && j-i==n-1) || (i>n && i-j==n-1 && j+i==(n*3)-1 )) {
					System.out.print((char)(64+i));
				}
				
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
