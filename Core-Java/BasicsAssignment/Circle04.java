// Write a  program to enter the radius of a circle and find its diameter = [2 * r], circumference = [2*3.14*r] and area = [3.14*r*r].


import java.util.Scanner;

public class Circle04{
	public static void main(String a[]) {
	Scanner sc = new Scanner(System.in); // input
	System.out.println("Enter radius of the circle:");
	int Radius = sc.nextInt();
	

	int diameter = 2 * Radius ;
	System.out.println("The Diameter of circle is:" + diameter);
	double circumference = (double)(2 * 3.14 * Radius);
	System.out.println("The circumference of circle is:" + circumference);
	double area = (double)(3.14 * Radius * Radius) ;
	System.out.println("The Area of circle is:" + area);  

	}
}
