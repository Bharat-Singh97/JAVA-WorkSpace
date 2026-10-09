public class upperAndlowercase{
	

	public static void main(String [] ags){
	String str = "Jai SiyaRam";
	// Upper case
	System.out.println("Upper Case "+str.toUpperCase());
	// Lower case
	System.out.println("Lower Case "+str.toLowerCase());


	// trim()  leading and trailing remove white space 

	String s1 = "   Hare  Krishna  ";
	System.out.println(s1);
	System.out.println(s1.trim());


   // doubt
	int num = 1234;
	System.out.println(String.valueOf(num));


	// Boxing  What is Boxing?
	// COnversion of primitive type to reference type
	//Wrapper classes(Boolean Byte character Short Intelger Long Float Double These all classes are called as Wrapper classes in Java) --> java.lang.Integer

	Integer i1 = Integer.valueOf(num);
	Integer i2 = new Integer(num);
	System.out.println(Integer.valueOf(num));


	// boolean   contains(CharSequence s) its check particular thing
	// boolean   contentEquals(CharSequence cs) it check whole things

	String sent = "Hare Krishna";
	String word = "Hare";
	System.out.println("contains: "+sent.contains(word));
	System.out.println("contentEquals : "+sent.contentEquals(word));

	// check counting of particular thing

	String mantra = "Hare Krishna Hare Krishna Krishna Krishna Hare Hare Hare Rama Hare Rama Rama Rama Hare Hare";
	String hare = "Hare";
	Stirng rama = "Rama";
	String krishna = "Krishna"; // i want to use same method for diffrenet to check how can build this ??

	// split()
	 int cnt = 0;
	 String [] words = mantra.split(" ");
	 for(String word1: words){
	 	if(word1.contentEquals(hare))
	 		cnt++;
	 }

	 System.out.println(hare +" occurance at " +cnt +" Times");



	//String inter()

	 String s1= new String("Ram"); // s1 is pointing to heap area Object
	s1=s1.inter(); // s1 is now pointing to literal pool Objects

	//static String format(String format, Object... agrs) 




	}
}