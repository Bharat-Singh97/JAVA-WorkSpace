public class Example13{
	public static void main(String args[]) {
		int x = 10, y = 5, z = 3;
        int output = ++x - y++ + z-- * --x + ++z + y * 2 - x-- + y++ - --z;//11-5+3*10+3+6*2-10+6-2=45
        System.out.println("Output: " + output);

      

   }

}  