package shanmathi;
import java.util.Scanner;
public class delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the Array:");
        int n=sc.nextInt();
        System.out.println("enter the elements:");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be deleted:");
        int num=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	if(n==a[i])
        	{
        		for(int j=1;j<n-1;j++)
        		{
        			a[j]=a[j+1];
        		}
        		break;
        	}
        }
        System.out.println("Array elemnt after deletion");
        for(int i=0;i<n-1;i++)
        {
        	System.out.println(a[i]);
        }
	}

}
