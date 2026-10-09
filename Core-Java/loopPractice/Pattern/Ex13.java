/*

*
**
***
****
*****

public class Ex01 {
	public static void main(String [] args) {
	int N = 5;
	for(int i = 1; i <= N; i++) {
	for(int j = 1; j <=i; j++){
	System.out.print("*");
	}
	System.out.println();
	}
	}
}



****
***
**
*

public class Ex02 {
	public static void main(String [] args) {
	int N = 4;
	for(int i = N; i >= 1; i--) {
	for(int j = i; j >=1; j--){
	System.out.print("*");
	}
	System.out.println();
	}
	}
}



1
12
123
1234
12345


public class Ex03 {
	public static void main(String [] args) {
	int N = 5;
	for(int i = 1; i <= N; i++) {
	for(int j = 1; j <=i; j++){
	System.out.print(j);
	}
	System.out.println();
	}
	}
}





1
22
333
4444
55555







public class Ex04 {
	public static void main(String [] args) {
	int N = 5;
	for(int i = 1; i <= N; i++) {
	for(int j = 1; j <=i; j++){
	System.out.print(i);
	}
	System.out.println();
	}
	}
}



1
23
456
78910  remember



public class Ex05 {
	public static void main(String [] args) {
	int N = 5;
	int cnt = 1;
	for(int i = 1; i <= N; i++) {
	for(int j = 1; j <=i; j++){
	System.out.print(cnt);
	cnt++;
	}
	System.out.println();
	}
	}
}


5
44
333
22
1  remember

public class Ex06 {
	public static void main(String [] args) {
	int N = 5;
	int cnt = 1;
	for(int i = N; i >= 1; i--) {
	for(int j = 1; j <=cnt; j++){
	System.out.print(i);
	}
	System.out.println();
	if(cnt < 3){
	cnt++;
	}else {
	cnt--;
	}
	}
	}
}



5
44
333
2222
11111


public class Ex07 {
	public static void main(String [] args) {
	int N = 5;
	for(int i = N; i >= 1; i--) {
	for(int j = 1; j <=N-i+1; j++){
	System.out.print(i);
	}
	System.out.println();
	}
	}
}




    *
   **
  ***
 ****
*****


public class Ex08 {
	public static void main(String [] args) {
	int N = 5;
	for(int i = 1; i <= N; i++) {
	for(int sp = i; sp < N; sp++){
	System.out.print(" ");
	}
	for(int j = 1; j <=i; j++){
	System.out.print("*");
	}
	System.out.println();
	}
	}
}



*****
 ****
  ***
   **
    *


    public class Ex09 {
	public static void main(String [] args) {
	int N = 5;
	for(int i = N; i >= 1; i--) {
	for(int sp = i; sp < N; sp++){
	System.out.print(" ");
	}
	for(int j = 1; j <=i; j++){
	System.out.print("*");
	}
	System.out.println();
	}
	}
}





    *
   ***
  *****
 *******
*********


 public class Ex10 {
    public static void main(String[] args) {

        int N = 5;

        for(int i = 1; i <= N; i++) {

            // Spaces
            for(int sp = i; sp < N; sp++) {
                System.out.print(" ");
            }

            // Stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}



*********
 *******
  *****
   ***
    *


    public class Ex11 {
    public static void main(String[] args) {

        int N = 5;

        for(int i = 5; i >= 1; i--) {

            // Spaces
            for(int sp = i; sp < N; sp++) {
                System.out.print(" ");
            }

            // Stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}




5
9 4
12 8 3
14 11 7 2
15 13 10 6 1


public class Ex12{
	public static void main(String[] args){
	int N = 5;
	int cnt = 5;
	for(int i = N; i >=1; i--) {
	int c = cnt;
	for(int j =i; j <=N; j++){
	System.out.print(c + "\t");
	c= c-j-1
	}
	System.out.println();
	cnt = cnt+i-1;
	}
	}
}


    5
   545
  54345
 5432345
543212345


*/

public class Ex13{
	public static void main(String[] args) {
	int N = 5;
	int cnt = 5;
	for(int i =  N; i>=1; i--){
	for(int sp = 1; sp <i; sp++){
	System.out.print(" ");
	}
	int c= cnt;
	for(int j = N; j >= i; j--){
	System.out.print(c);
	c--;
	}
	System.out.println();
	}
	}
}