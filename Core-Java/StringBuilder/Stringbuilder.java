/* public final class java.lang.StringBuilder implements Serilizable,CharSequence,Appendable{
	public StringBuilder()
	public StringBuilder(int capacity)
	public StringBuilder(String)
	public StringBuilder(CharSequence)


}

*/

public class Stringbuilder{
	public static void main(String [] args) {

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder(55);
		StringBuilder sb3 = new StringBuilder("Hellp");
		CharSequence letters = new String("Hello");
		StringBuilder sb4 = new StringBuilder(letters);

		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		System.out.println(sb4);



	}
} 