package agilambal;
import java.util.*;

public class Rectangle {
	

		int wid,height;

		int perimeter;

		public static void main(String[] args) {

			Scanner s = new Scanner(System.in);

			System.out.print("Enter the Width: ");

			int width = s.nextInt();

			System.out.print("Enter the Height :");

			int height = s.nextInt();

			int perimeter = width * height;

			System.out.println("The Perimeter of the Rectangle is " + perimeter);

		}

	}


