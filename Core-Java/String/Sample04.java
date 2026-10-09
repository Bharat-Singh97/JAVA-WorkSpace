class Sample04{
	public static void main(String[] args){

		//String object created using new keyword
		String s1 = new String("Hare");// s1 is not the String object.s1 is a reference variable that refers to a String object.
        //String object created without using new keyword
        String s2 ="Krishna";
        String s3 = new String("Hare");
        String s4 = "Ram";
        String s5 = "Sita";
        String s6 = s1.concat(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

        // s1 == s3 -> false -> because s1 and s3 refer to different objects.
}

}