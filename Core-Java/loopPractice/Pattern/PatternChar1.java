public class PatternChar1{
	public static void main(String[] args) {

	int cnt = 1;
	int N = 5;
	for(int i = 1; i <=5; i++){
	for(int j = 1; j <=i; j++){
	System.out.print((char)(64+cnt));
	cnt++;
	}
	System.out.println();
	}
	}
}