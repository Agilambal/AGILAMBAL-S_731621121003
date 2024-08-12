package pattern_prgm;
import java.util.Scanner;
public class pyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2;j++) {
				if(i+j>=n+1 && j-i<=n-1 && ((n%2!=0)?((i+j)%2==0):((i+j)%2!=0))) 
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}

