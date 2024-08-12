import java.util.*;
public class sumofarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] k=new int[2];
		int[] j=new int[2];
		for(int i=0;i<2;i++) {
			k[i]=sc.nextInt();
			j[i]=sc.nextInt(); 
		}
		int[] s=new int[2];
		for(int i=0;i<2;i++) {
			//System.out.println(k[i]+" "+j[i]);
			 s[i]=k[i]+j[i];
		}
		  for (int i = 0; i < 2; i++) {
	            System.out.print(s[i] + " ");
	        }
	}

}
