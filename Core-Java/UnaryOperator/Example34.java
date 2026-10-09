public class Example34{
	public static void main(String args[]) {
		int p = 3, q = 3, r = 3;
        int calc = p + q++ * --r - r + ++q;// 3+3*2-2+5=12
        System.out.println("Calc: " + calc);

      

   }

}  