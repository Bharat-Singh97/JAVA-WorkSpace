public class Example02{
	public static void main(String args[]) {
	int num =  11999;  // outpu = 22000
	System.out.println("The original number is :" + num);

	int first = ((num%10)+1)%10; // 0
	num = num/10; //1199
	int second = ((num%10)+1)%10; // 0
	num = num/10; //119
	int third = ((num%10)+1)%10; // 0
	num = num/10; //11
	int fourth = ((num%10)+1); // 2
	num = num/10; //1
	int fifth = ((num%10)+1); // 2

	int FinalNumber = fifth*10000 + fourth*1000 + third*100 + second*10 + first*1;
	System.out.println("The final output is :" + FinalNumber);  // 22000
	
	}
}