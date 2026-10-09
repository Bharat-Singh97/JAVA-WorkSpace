//Write a  program to enter two angles of a triangle and find the third angle. total sum = 180 degree


import java.util.Scanner;

public class Triangle06{
	public static void main(String a[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first angle is:");
	int A1 = sc.nextInt(); 
	System.out.println("Enter second angle is:");
	int A2 = sc.nextInt();  

	int A3 = (180 - (A1 + A2));
	System.out.println("The third angle is:" + A3);

	}
}