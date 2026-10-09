public class Example15{
	public static void main(String args[]) {
		int i = 3, j = 5, k = 2;
        int val = i++ + j-- - ++k * i-- + j++ + --i - k--;//3+5-3*4+4+2-3=-1
        System.out.println("Value: " + val);

      

   }

}  