package pattern_prgm;

import java.util.Scanner;

public class alpha_pyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++) { 
			for(int j=1;j<=n*2;j++) {
			if(((n%2)!=0 ? (i+j)%2==0: (i+j)%2!=0) &&((i<=n) && (i+j>=n+1 && j-i<=n-1)))
					System.out.print((char)(64+((i+j)-4)/2));
			else 
				System.out.print(" ");
			}
			System.out.println();
			}
	}

}
