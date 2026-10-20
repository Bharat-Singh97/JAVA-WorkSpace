import java.util.Scanner;

public class SumOfN{
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the range: " );
	int n = sc.nextInt();

	int cnt = 1;

	int sum = 0;

	while(cnt <= n){

	sum += cnt;

		cnt++;


	}

			System.out.print("Sum of first " + n +" natural num: " + sum );


	}
}