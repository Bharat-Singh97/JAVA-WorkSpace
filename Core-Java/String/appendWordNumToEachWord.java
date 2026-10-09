public class appendWordNumToEachWord{

public static String appendWordPosition(String input){
     StringBuilder res = new StringBuilder(input.length());
	
	// split input by spaces get words[]
	 String []words = input.split(" ");
	 System.out.println(words);
	 //StringBuilder res = new StringBuilder(input.length()+words.length);
	 int cnt =1;

      // apply loop with index or take counter
	 for(String word : words){
	 res.append(word).append(cnt).append(" ");
	 cnt++;
	 }



	 // add after word that index or counter and stores in res
	 // res.toString().trim()
	 return String.valueOf(res).trim();
}
	







	public static void main(String[] args) {

	String input = "hello i am java developer";

	String output = appendWordPosition(input);

	System.out.println(output);
	}
}