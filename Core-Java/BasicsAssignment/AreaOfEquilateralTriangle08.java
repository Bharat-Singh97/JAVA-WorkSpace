//Write a  program to calculate the area of an equilateral triangle. Area = (1.732/4)* s *s  , root 3 = 1.732

import java.util.Scanner;

public class AreaOfEquilateralTriangle08{
	public static void main(String a[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter side of the equilateral triangle is:");
	float s = sc.nextFloat(); 
	  

	float area = ((1.732f/4) * s * s );
	System.out.println("The area of equilateral triangle is:" + area);

	}
}
