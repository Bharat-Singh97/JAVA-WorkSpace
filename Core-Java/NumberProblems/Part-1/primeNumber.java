//Number is prime or not

import java.util.Scanner;

public class primeNumber{
	
	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);

	System.out.println("Enter a number: ");
	int num = sc.nextInt();
	if(num == 2){
		System.out.println("Prime number: "+ num);
      }
      else {
	   boolean isPrime = true;

	   for(int i =2; i <= Math.sqrt(num); i++){

	   	if(num % i ==0){
	   		isPrime = false;
	   	}
	   }

	   if(isPrime == true){
	System.out.println("Prime number: "+ num);

	}else {
		System.out.println(" Not Prime number: "+ num);
	     }

	   }

	
	}
}