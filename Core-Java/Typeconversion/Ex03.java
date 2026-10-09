public class Ex03{
	
	public static void test(float x) {System.out.println("float "+x);}

	public static void main(String []args){
	//test(11.11);   error: incompatible types: possible lossy conversion from double to float
		test(11.11f);
		test((float) 11.11); // 11.11 double 
	}
}