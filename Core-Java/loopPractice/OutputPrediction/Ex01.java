
/*
0
4
2
1
6
4
2
10
8
10
*/



public class Ex01{
	public static void main(String[] args) {
int a = 3;
int b = 1;
int i = 0;

while (i < 3) {
    a = a + b;
    b = b * 2;

    System.out.println(i);
    System.out.println(a);
    System.out.println(b);

    i++;
}

System.out.println(a);



   }
 }