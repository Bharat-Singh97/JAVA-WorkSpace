//Write a  program to enter the base and height of a triangle and find its area.

import java.util.Scanner;

public class AreaOfTriangle07{
	public static void main(String a[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter base of the triangle is:");
	float base = sc.nextFloat(); 
	System.out.println("Enter height of the triangle is:");
	float height = sc.nextFloat();  

	float area = (0.5f * base * height);
	System.out.println("The area of triangle is:" + area);

	}
}