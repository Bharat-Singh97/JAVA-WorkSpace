public class Example04{
	public static void main(String args[]) {
        int m = 4;
        int n = 6;
        int result = ++m - n-- + m++ + --n; // 5-6+5+4 = 8
        System.out.println(result);
   }

}  