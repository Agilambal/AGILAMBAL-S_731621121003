package pattern_prgm;

import java.util.Scanner;

public class decrease_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			for(int j=n;j>=1;j--) {
			if(i+j>=n)
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
