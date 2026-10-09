//Write a Java program to convert days to years weeks and days.

import java.util.Scanner;
public class DaysConvertor{
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);

    System.out.println("Enter Total Days:");
	int totalDays = sc.nextInt();
	int years = totalDays/365;
    int remainder = totalDays%365;
	int weeks = remainder/7;
	int days = remainder%7;
	System.out.println(years + " years " + weeks + " weeks " + days +" days ");

	}
}