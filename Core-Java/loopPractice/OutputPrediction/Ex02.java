
/*
0
12
8
1
14
-6
2
16
-22
3
18
-40
18
-40
*/



public class Ex02{
	public static void main(String[] args) {
int x = 10;
int y = 20;
int i = 0;

while (i < 4) {
    x = x + 2;
    y = y - x;

    System.out.println(i);
    System.out.println(x);
    System.out.println(y);

    i++;
}

System.out.println(x);
System.out.println(y);


   }
 }