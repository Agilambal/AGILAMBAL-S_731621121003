import java.util.Scanner;
public class largestodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int ans=0,temp=0;
			for(int i=0;i<str.length()-2;i++) {
				temp=Integer.valueOf(str.substring(i,i+3));
				
				if(temp>ans && temp%2==1) {
					ans=temp;
			}
			}
			System.out.println(ans);
			
	}

}
