package Task_file;

import java.util.Scanner;

public class Sandhiya_Rectangle {
	public static void main(String args[]) {
		double rectangleLength;
		double rectangleWidth;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter length of rectangle:");
		rectangleLength = in.nextInt();

		System.out.println("Enter width of rectangle:");
		rectangleWidth = in.nextInt();

		double areaOfRectangle = rectangleLength * rectangleWidth;
		System.out.println("Area of rectangle is: " + areaOfRectangle);

		double circumferenceOfRectangle = 2 * (rectangleLength) + 2 * (rectangleWidth);
		System.out.println("Circumference of rectangle is: " + circumferenceOfRectangle);
	}
}
