import java.util.*;
public class c1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str =sc.next();
		char r=sc.next().charAt(0);
		sc.close();
		int count=0;
		char[] c=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(c[i]== r) {
				count++;
			}
			}
		System.out.print(count);
	}

}
