//Write a  program to enter P, T, R and calculate Simple Interest. SI = P*R*T/100

import java.util.Scanner;

public class SimpleInterest10{
	public static void main(String a[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Principal amount:");
	int P = sc.nextInt(); 
	System.out.println("Enter Rate of Interest:");
	float R = sc.nextFloat(); 
	System.out.println("Enter Time period:");
	int T = sc.nextInt(); 
	
	  

	float SI = ( (P * R * T)/100);
	System.out.println("The Simple Interest is:" + SI);
	

	}
}
