import java.util.Scanner;

public class reverseNumber{
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the number: " );
	int n = sc.nextInt();
	System.out.println("Original number: " + n);
	int digit = 0;

	while(n > 0){

		int lastDigit = n%10;
		digit = digit * 10 + lastDigit;

		n/=10;
	}

	System.out.println("Reverse of the number: " +digit);

	
  }
}