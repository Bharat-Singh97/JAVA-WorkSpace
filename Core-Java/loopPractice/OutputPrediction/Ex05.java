
/*
0
25
2
1
8
3
2
2
4
2
5
*/

public class Ex05{
	public static void main(String[] args) {
int p = 50;
int q = 2;
int i = 0;

while (i < 3) {
    p = p / q;

    System.out.println(i);
    System.out.println(p);
    System.out.println(q);

    q = q + 1;
    i++;
}

System.out.println(p);
System.out.println(q);





   }
 }