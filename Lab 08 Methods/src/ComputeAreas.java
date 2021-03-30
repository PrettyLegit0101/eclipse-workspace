
/* 
Class: CSE 1321L 
Section: 	Lab 8       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		8
 */
import java.util.Scanner;

public class ComputeAreas {

	public static double squareArea(double side) {
		
		double localArea = 0;

		localArea = side * side;

		return localArea;
	}

	public static double rectangleArea(double length, double width) {
		
		double localRectangleArea = 0;

		localRectangleArea = length * width;

		return localRectangleArea;
	}

	public static double circleArea(double radius) {
	
		double localCircleArea = 0;

		localCircleArea = Math.PI * radius * radius;

		return localCircleArea;
	}

	public static double triangleArea(double base, double height) {
	
		double localTriangleArea = 0;

		localTriangleArea = 0.5 * base * height;

		return localTriangleArea;
	}
	
	

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		// taking in input, grouped by their shape
		System.out.println("Enter in the side of square ");
		double side = reader.nextDouble();

		System.out.println("Enter in the length for rectangle ");
		double length = reader.nextDouble();
		System.out.println("Enter in the width for rectangle ");
		double width = reader.nextDouble();

		System.out.println("Enter in the radius for circle ");
		double radius = reader.nextDouble();

		System.out.println("Enter the base for the triangle ");
		double base = reader.nextDouble();
		System.out.println("Enter the height for the triangle ");
		double height = reader.nextDouble();

		// store the function values into global variables
		double squareArea = squareArea(side);
		double rectangleArea = rectangleArea(length, width);
		double circleArea = circleArea(radius);
		double triangleArea = triangleArea(base, height);

		// print results which are group by their shapes
		System.out.println("Square side: " + side);
		System.out.println("Square area: " + Math.round(squareArea * 10000.0) / 10000.0);
		System.out.println("\n");

		System.out.println("Rectangle width: " + width);
		System.out.println("Rectangle length: " + length);
		System.out.println("Rectangle area: " + rectangleArea);
		System.out.println("\n");
		
		System.out.println("Circle radius: " + radius);
		System.out.println("Circle area: " + circleArea);
		System.out.println("\n");
		
		System.out.println("Triangle base " + base);
		System.out.println("Triangle height " + height);
		System.out.println("Triangle area " + triangleArea);
	}
}
