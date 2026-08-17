public class Example01{
	public static void main(String a[]) {
	int num = 12993; // output 23004
	System.out.println("Original Number:" + num);
	int first = (num%10)+1;  //4
	num = num/10; // 1299
	int second = ((num%10)+1)%10; //0
	num = num/10; // 129
	int third = ((num%10)+1)%10; //0
	num = num/10; //12
	int fourth = (num%10)+1; // 3
	num = num/10; //1
	int fifth = (num%10)+1;  //2

	int FinalNumber = (fifth*10000 + fourth*1000 + third*100 + second*10 +first*1);
	System.out.println("The final number is:" + FinalNumber);


	}
}