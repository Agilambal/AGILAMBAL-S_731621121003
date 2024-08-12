package shanmathi;

import java.util.Scanner;

public class anagram {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string1:");
    String s1=sc.nextLine();
    System.out.println("Enter the String2:");
    String s2=sc.nextLine();
    char x[]=s1.toCharArray();
    char y[]=s2.toCharArray();
    if(x.length==y.length)
    {
    	for(int i=0;i<x.length;i++)
    	{
    		for(int j=0;j<y.length;j++)
    		{
    			if(x[i]==y[j])
    			{
    			count++;
    			break;
    		}
    	}
    }
    if(count ==x.length)
    {
    	System.out.println("the string is anagram");
    }
    else
    {
    	System.out.println("the string is not anagram");
    }
}

}
}
