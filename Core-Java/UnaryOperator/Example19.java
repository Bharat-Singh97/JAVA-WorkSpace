public class Example19{
	public static void main(String args[]) {
		int p = 10, q = 5, r = 2;
        int value = p++ - --q + r++ * --p - q-- + ++r + p;//10-4+2*10-4+4+10=36
        System.out.println("Value: " + value); 

      

   }

}  