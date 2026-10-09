 /* Write a  program to enter the length and breadth of a rectangle and find its perimeter = 2[l+b].
Write a  program to enter the length and breadth of a rectangle and find its area = l * b.*/


import java.util.Scanner;

public class PerimeterOfRectangle03{
	public static void main(String a[]) {
	Scanner sc = new Scanner(System.in); // input
	System.out.println("Enter length of the rectangle:");
	int length = sc.nextInt();
	System.out.println("Enter breadth of the rectangle:");
	int breadth = sc.nextInt();

	int perimeter = 2 * (length + breadth);
	System.out.println("The Perimeter of rectangle is:" + perimeter);
	int area = length * breadth;
	System.out.println("The Area of rectangle is:" + area);  

	}
}
