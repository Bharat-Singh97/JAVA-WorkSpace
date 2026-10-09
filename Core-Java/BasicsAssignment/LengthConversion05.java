//Write a  program to enter length in centimetres and convert it into meter and kilometer. 1m = 100cm , 1km = 1000m = 100000cm

import java.util.Scanner;

public class LengthConversion05{
	public static void main(String a[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length in cm:");
	double length = sc.nextDouble();  // length in cm

	double meter = (length/100);
	System.out.println("Length in meter:" + meter); // length in meter

	double km = length/100000;
	System.out.println("Length in km:" + km); // length in km

	}
}