//Write a Java program to convert seconds to hours, minutes and seconds.

import java.util.Scanner;
public class SecondsConvertor{
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);

    System.out.println("Enter Total Seconds:");
	int totalSeconds = sc.nextInt();
	int hours = totalSeconds/3600;
    int remainder = totalSeconds%3600;
	int minutes = remainder/60;
	int seconds = remainder%60;
	System.out.println(hours + " hour " + minutes + " minute " + seconds +" second ");

	}
}