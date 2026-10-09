public class equalCheck01{
	public static void main(String[] args){

	String s1 = "good";
	String s2 = s1+"time"; // concat  run time at heap me bana
	String s3 = "goodtime"; // at Stirng constant pool
	String s4 = s1+"time".intern(); // started point out at heap to string constat pool
		

	if(s2==s3){
	System.out.println("Equal");
	}
	else{
	System.out.println("Not Equal");  //ans
	}



	if(s2.equals(s3)){
	System.out.println("Equal"); // ans
	}
	else{
	System.out.println("Not Equal");
	}



	if(s4.equals(s3)){
	System.out.println("Equal"); // ans
	}
	else{
	System.out.println("Not Equal");
	}




	}
}