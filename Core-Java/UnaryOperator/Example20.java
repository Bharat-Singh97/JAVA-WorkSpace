public class Example20{
	public static void main(String args[]) {
        int i = 6, j = 3, k = 2;
        int answer = --i + j++ - ++k * i-- + j - --k + i;//5+3-3*5+4-2+4=-1
        System.out.println("Answer: " + answer); 

   }

}  