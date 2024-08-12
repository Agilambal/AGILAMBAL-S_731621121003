import java.util.Scanner;
public class CompareObject
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String str1 = s.nextLine();
        System.out.println("Enter the String 2: ");
        String str2 = s.nextLine();
if (str1.equals(str2)) {
    System.out.println("Equal");
} else {
    System.out.println("Not Equal");
}
}
}
