/*

Right-Aligned Half Pyramid logic


    *
   **
  ***
 ****
*****
Formulas:
Spaces = n - i
Stars = i  */

public class Ex02{
	public static void main(String [] args) {


	int N = 5;
	int cnt1 = 5;
	int cnt2 = (n*(n+1)/2); //15
	for(int i = N; i >=1 ; i--) {
	for(int sp = 1; sp < i; sp++){
	System.out.print(" ");
	}

	int c1 = cnt1;
	int c2 = cnt2;
	for(int j1 = N , j2 = N; (j >=i && j>=i); j1--, j2-- ){

	System.out.print((char)(c1+64));
	System.out.print((char)(c2+64 + "\t"));
	c1 = c1 + j1;
	c2 = c2 - j2;

	}
	cnt1--;
	cnt2--;
	
	System.out.println();
	}
	}
}

