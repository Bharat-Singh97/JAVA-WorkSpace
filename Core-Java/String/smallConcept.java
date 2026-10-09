public class smallConcept{
	public static void main(String[] args) {

	String s1 ="Krishna";
	for(int i = 0; i < s1.length();i++){
	System.out.println(s1.charAt(i));
	}

	// ASCII --> UNICODE

	for(int i = 0; i < s1.length(); i++){
	System.out.println(s1.codePointAt(i));
	}

 // public int indexOf(int)
 // public int lastIndexOf(int)

 System.out.println("indexOf "+s1.indexOf('1'));
 //first Occurance
 System.out.println("lastIndexOf "+ s1.lastIndexOf('1'));

 // int   indexOf(int ch, unt fromIndex)
 // int   LastIndexOf(int ch, int fromIndex)


 String str="";
 System.out.println("==> "+str.length());

 System.out.println("isEmpty  "+ str.isEmpty());

 // String      replace(char oldChar , char newChar)
 //String       replace(CharSequence target, CharSequence replacement)

 String movie = "Hum dil de chuke sanam HHHH";
 String changeMovieName = movie.replace('H','T');
 System.out.println(movie);
 System.out.println(changeMovieName);


 String text = "Hello I love India";

 System.out.println("replace String "+text.replace("I","o"));

 // String[] split(String regex)

 // V. imp

 String mob="999-666-22-44";
 String numbers[]=mob.split("-");

 for(String num : numbers)
 System.out.println(num);

 String url = "www.facebook.com";

 String words[] = url.split("\\.");

 for(String word: words)
 System.out.println(word);


 String strs = "I Love India";
// boolean startsWith(String)
//// boolean endssWith(String)

 System.out.println("start With "+strs.startsWith("I"));
 System.out.println("end With "+strs.endsWith("India"));


 //String  subsstring(int beginIndex)
 //String substring(int begoncOndex, int endIndex)

 System.out.println(strs.substring(1));
 System.out.println(strs.substring(2,6));  //from=2 <end

 System.out.println(strs.toUpperCase());
 System.out.println(strs.toLowerCase());

	}
}
