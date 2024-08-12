package pattern_prgm;

import java.util.Scanner;

public class numsquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<(n+n-1);i++) {
			for(int j=0;j<(n+n-1);j++) {
				if(i==0 || j==0 ||i==(n+n-1)-1 || j==(n+n-1)-1 ) {
					System.out.print(n+" ");}
				else if(i+j>=2 && i+j<n*2)
				System.out.print(n-1+" ");
				
			}
			System.out.println();
			}
	}

}
