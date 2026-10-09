public class ImmutableVsMutable{
	public static void main(String [] args) {

	String s1 = "Hello";  // Immutable

	for(int i = 0; i <=10; i++){
	s1.concat("Bye");

	}
	System.out.println(s1);

	StringBuilder sb1 = new StringBuilder(s1); // mutable

	for(int i = 1; i <=10; i++){
	sb1.append("Bye");

	}
	System.out.println(sb1);
	}
}