package pattern_prgm;
import java.util.Scanner;
public class Test{
	public static int s(int m,int n) {
	
	int c=0;
	for(int i=m;i<=n;i++) {
		int a=i,x=0,y=i,z=0;
		while(y!=0) {
			x++;
			y/=10;
		}
		while(a!=0) {
			int b=a%10;
			if(b==1||b==4||b==9) {
				z++;
			}
			a/=10;
		}
		if(z==x) {
			c++;
		}
	}
	return c;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int c=s(n,m);
		System.out.println(c);
	}
}
		

 
		 
		 
 