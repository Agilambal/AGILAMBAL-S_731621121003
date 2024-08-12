package shanmathi;
import java.util.*;
public class tom {

	public static void main(String[] args) {
		Scanner dc=new Scanner(System.in);
		int c=dc.nextInt();
		for (int i=0;i<=c;i++) {
			for (int j=0;j<c*2;j++) {
				if(i+j<=4 && i-j<2 )
					System.out.println("*");
		
			}
		}
   

		
	}

}
