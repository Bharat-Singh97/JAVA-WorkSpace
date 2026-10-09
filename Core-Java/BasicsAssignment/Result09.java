// Write a  program to enter marks of five subjects and calculate total, average and percentage.

import java.util.Scanner;

public class Result09{
	public static void main(String a[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter marks of Maths:");
	int Maths = sc.nextInt(); 
	System.out.println("Enter marks of Physics:");
	int Physics = sc.nextInt(); 
	System.out.println("Enter marks of Chemistry:");
	int Chemistry = sc.nextInt(); 
	System.out.println("Enter marks of English:");
	int English = sc.nextInt(); 
	System.out.println("Enter marks of Hindi:");
	int Hindi = sc.nextInt(); 
	  

	int TotalMarks= (Maths + Physics + Chemistry + English + Hindi );
	System.out.println("The total marks is:" + TotalMarks);
	float Average= (float)(TotalMarks/5f );
	System.out.println("The Average marks is:" + Average);
	float Percentage= (float)((TotalMarks/500f)*100 );
	System.out.println("The percentage  is:" + Percentage +"%");

	}
}

