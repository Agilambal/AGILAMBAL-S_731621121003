import java.util.*;
public class colidrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
		sc.close();
		String fh=str.substring(0,str.length()/2);
		String sh=str.substring(str.length()/2);
		if(fh.equals(new StringBuilder(sh).reverse().toString()))
			System.out.println("Colindrome");
		else
		System.out.println("Not Colindrome");
	}

}
