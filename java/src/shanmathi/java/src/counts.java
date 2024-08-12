import java.util.*;
public class counts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
		int d=sc.nextInt();
		int c=0;

        while(n>0){
            int rem = n%10;
            if(rem == d)
                c++;
            n /= 10;
        }
        System.out.println(c);
	}

}
