public class Ex01{
	
	public static void test(long x) {System.out.println("long "+x);}

	public static void main(String []args){
	test(11); // test(int) compiler internally int --> Promote --> long 
	}
}