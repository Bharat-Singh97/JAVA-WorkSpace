import java.util.Scanner;
public class App{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number: ");
	int num = sc.nextInt();

	NumberOperation numOp = new NumberOperation();
	numOp.number = num;

	System.out.println("Sum = " + numOp.sumOfDigit());

	numOp.printFactor();   // Accessing member method | instance method of NumberOperation Type
















	}
}

// Note we can write n number of class in single java.
// But there is only one public class
// you can't write multiple  public class inside single .java
// name of public class must be filename