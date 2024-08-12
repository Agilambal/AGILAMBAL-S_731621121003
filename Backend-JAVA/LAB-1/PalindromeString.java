import java.util.*;
class PalindromeString{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.print("Enter a String:");
String str=s.nextLine();

StringBuilder str1=new StringBuilder(str);
str1.reverse();
if(str.equals(str1.toString())){
System.out.println("Palindrome");
}else{
System.out.println("Not a Palindrome");
}
}
}