public class Ex02{
	
	public static void test(float x) {System.out.println("float "+x);}

	public static void main(String []args){
	test(11); // test(int) compiler internally int --> Promote --> float 
	}
}