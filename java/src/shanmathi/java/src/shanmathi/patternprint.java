package shanmathi;
import java.util.*;
public class patternprint {
	public static void main(String[]args) {

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String inputString = scanner.nextLine();

		        int repeatedCharCount = countRepeatedCharacters(inputString);
		        System.out.println("Number of characters with count more than 1: " + repeatedCharCount);
		        
		        scanner.close();
	}
	 private static int countRepeatedCharacters(String str) {
	        int count = 0;
	        Set<Character> characters = new HashSet<>();
	        for (char ch : str.toCharArray()) {
	            if (!characters.add(ch)) {
	                count++;
	            }
	        }
	        return count;
	}
}
