
/*
1
10
3
2
30
5
3
150
8
150
8
*/

public class Ex04{
	public static void main(String[] args) {
int m = 5;
int n = 2;
int i = 1;

while (i <= 3) {
    m = m * n;
    n = n + i;

    System.out.println(i);
    System.out.println(m);
    System.out.println(n);

    i++;
}

System.out.println(m);
System.out.println(n);



   }
 }