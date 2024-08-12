package pattern_prgm;

import java.util.Scanner;

public class num_diamond {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1;
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<n*2;j++) {
				if((i<=n && i+j>=n+1 && j-i<=n-1) || (i>n && i-j<n && j+i<n*3)) {
					if((n-j+1)>0)
						System.out.print(n-j+1);
					else
						System.out.print(j-n+1);
					
				}
				else
				System.out.print(" ");
			}
			a++;
			System.out.println();
			}
	}

}
