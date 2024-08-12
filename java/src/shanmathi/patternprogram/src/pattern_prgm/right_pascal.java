package pattern_prgm;

import java.util.Scanner;

public class right_pascal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<=n;j++) {
				if(((i<=n) && i>=j)|| (i>=n && i+j<=n*2))
				System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
			}
	}

}
