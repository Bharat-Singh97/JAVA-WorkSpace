import java.util.Scanner;

public class reverseString{

public static String reverse(String input){
String output=" ";
for(int i = input.length()-1; i>=0; i--){
output = output+input.charAt(i);
}
return output;
	
}


 public static void main(String[] args) {

 String input;
 System.out.println("Enter Input To reverse String");

 Scanner sc = new Scanner(System.in);
 input = sc.nextLine();

 String s1 = reverse(input);
 System.out.println(s1);
 }
	
}