package pattern_prgm;
import java.util.*;
public class mav1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int middle = n%2==0?n/2:(n/2)+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(((i==middle)&& (j==middle)))
					System.out.print("  ");
			else if(( i==1 || i==n || j==1 || j==n ||( i==j || j+i==n+1)) )
					System.out.print("* ");
				else 
			System.out.print("  ");
			}
			System.out.println();
			}
	}

}
