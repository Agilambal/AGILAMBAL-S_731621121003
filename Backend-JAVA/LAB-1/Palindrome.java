import java.util.*;
class Palindrome{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int n=s.nextInt();
int r,sum=0,temp;
temp=n;
while(n>0){
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
System.out.println("palindrome");
else
System.out.println("Not a Palindrome");
}
}
