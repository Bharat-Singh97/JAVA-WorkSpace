
/*
1
0
3
4
1
4
7
2
7
11
3
11
18
11
18
*/

public class Ex06{
	public static void main(String[] args) {
int h = 7;
int k = 3;

h = h % k;

System.out.println(h);

int i = 0;

while (i < 4) {
    k = k + h;
    h = k - h;

    System.out.println(i);
    System.out.println(h);
    System.out.println(k);

    i++;
}

System.out.println(h);
System.out.println(k);

   }
 }