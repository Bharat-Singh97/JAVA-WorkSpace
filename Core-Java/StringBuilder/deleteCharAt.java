class deleteCharAt{
	public static void main(String [] args) {

	StringBuilder sb1 = new StringBuilder("I Love India");
	System.out.println(sb1);
	sb1.delete(2,6); // delete something from string but be careful its mutable
	System.out.println(sb1); // I    India
	sb1.insert(2," Love Bharat");
	System.out.println(sb1);


	StringBuilder sb2 = new StringBuilder("Playing Cricket");


	// sb2.insert(8, "FootBall")
	sb2.insert(8, "FootBall ");
	System.out.println(sb2);


	// StringBuilder replace(int start , int end, String str)

	StringBuilder  sb3= new StringBuilder("Hare Krishna");

	// sb2.replace(4 ,sb3.length(), "Ram")
	sb3.replace(4,sb3.length(), "Ram");
	System.out.println(sb3);


	//StringBuilder reverse()

	StringBuilder sb4 = new StringBuilder("Hello");
	System.out.println(sb4.reverse());




	}
}