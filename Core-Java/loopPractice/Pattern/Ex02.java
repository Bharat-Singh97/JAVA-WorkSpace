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
	int cnt2 = (N*(N+1)/2); //15
	for(int i = 1; i <=N ; i++) {
	for(int sp = i; sp < N; sp++){
	System.out.print(" ");
	}

	int c1 = cnt1;
	int c2 = cnt2;
	for(int j1 = 1 , j2 = 1 ; (j1 <=i && j2<=i); j1++, j2++ ){

	System.out.print((char)(c1+64));
	System.out.print((char)(c2+64));
	c1 = c1+j1;
	c2 = c2 - j2 + 1;

	}
	cnt1--;
	cnt2--;
	
	System.out.println();
	}
	}
}

