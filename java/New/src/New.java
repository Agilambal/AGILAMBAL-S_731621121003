import java.util.Scanner;

public class New{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        System.out.println("ASCII values found in the string:");
        findASCII(input);
    }
    
    public static void findASCII(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int asciiValue = (int) c;
            
            System.out.println(c + " : " + asciiValue);
        }
    }
}
