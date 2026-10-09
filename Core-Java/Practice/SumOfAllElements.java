public class SumOfAllElements{
	public static void main(String [] args) {

	int[] num = {5,10,15,20};

	int sum = num[0];

	for(int i = 1; i < num.length; i++){
	sum += num[i];
	}

	System.out.print(sum);
	}
}