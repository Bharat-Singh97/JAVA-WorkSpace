public class Example21{
	public static void main(String args[]) {
		int a = 5, b = 2, c = 1;
        int result = ++a + b++ - c-- + a * b - --a - c + ++b;//6+2-1+6*3-5-0+4=24
        System.out.println("Result: " + result); 

      

   }

}  