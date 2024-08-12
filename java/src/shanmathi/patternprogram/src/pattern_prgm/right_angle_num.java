package pattern_prgm;

import java.util.Scanner;

public class right_angle_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			int a=i;
			for(int j=1;j<=i;j++) {
				System.out.print(a);
				a--;
			}
			System.out.println();
			}
	}

}
