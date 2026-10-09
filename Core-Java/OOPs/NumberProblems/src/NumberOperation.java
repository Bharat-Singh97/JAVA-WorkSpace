/** its called Documentation if other developer read and understand
* @author : Bharat
* @since 1.5
*
**/



public class NumberOperation{
	
	int number;

	int sumOfDigit(){
	int temp = number;
	int sum = 0;
	 while(temp >0) {
	 sum+=temp%10;
	 temp /=10;

	 }
	 return sum;
	}

	void printFactor() {
	System.out.println("Enter Factor :" + number);
	System.out.println("--------------------------------");
	for(int i = 1; i < number; i++){
	if(number%i ==0){
	System.out.printf("%-2d \n", i);
        }
      }
	}

	
}