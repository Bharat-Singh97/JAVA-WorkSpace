public class Example05{
	public static void main(String args[]) {
       int a = 2;
       int b = 3;
       int c = a++ + b++ - --a + --b; // 2+3-2+3= 6
       System.out.println(c);

   }

}  