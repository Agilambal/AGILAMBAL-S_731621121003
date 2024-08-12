package shanmathi;
import java.util.Scanner;
public class allstring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the String:");
	    String n=sc.nextLine();
	    char a[]=n.toCharArray();
	    for(int i=0;i<a.length;i++)
	    {
	    	if(a[i]>='a'&&a[i]<='z'||a[i]>='A'&&a[i]<='Z')
	    	{
	    		System.out.println("yes");
	    		count++;
	    		break;
	    	}
	    	else if(a[i]=='a'&&a[i]=='z'||a[i]=='A'&&a[i]=='Z')
	    	{
	    		System.out.println("no");
	    		break;
	    	}
	    }
	}
	
}
