package pattern_prgm;

import java.util.Scanner;

public class numeric_sandclock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<n*2;j++) {
				if(j-i>=0 && i+j<=n*2 && ((n%2!=0)?((i+j)%2==0):((i+j)%2!=0))) 		
					System.out.print((i+j)/2);
				else if ((i>n) && i+j>n*2 && i-j<=0) 
					System.out.print("*");
			
			}
			System.out.println();
			}
	}

}
