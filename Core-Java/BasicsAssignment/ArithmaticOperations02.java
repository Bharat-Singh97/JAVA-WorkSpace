// Write a  program to enter two numbers and perform all arithmetic operations.

import java.util.Scanner;

public class ArithmaticOperations02{
	public static void main(String a[]) {
	Scanner sc = new Scanner(System.in); // input
	System.out.println("Enter first number:");
	int num1 = sc.nextInt();
	System.out.println("Enter second number:");
	int num2 = sc.nextInt();

	int sum = num1 + num2;
	System.out.println("Sum of num1 and num2 is:" + sum);  
	int sub = num1 - num2;
	System.out.println("Substraction of num1 and num2 is:" + sub);  
	int mul = num1 * num2;
	System.out.println("Product of num1 and num2 is:" + mul);  
	double div = (double) num1 / (double) num2;
	System.out.println("Division of num1 and num2 is:" + div);  
	int mod = num1 % num2;
    System.out.println("Modules of num1 and num2 is:" + mod);  

	}
}
