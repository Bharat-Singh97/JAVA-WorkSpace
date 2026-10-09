
/*
0
10
1
7
2
1
1
*/

public class Ex14{
	public static void main(String[] args) {

int p = 10;
int q = 3;
int i = 0;

while (i < 3) {
    p = p - (q * i);

    System.out.println(i);
    System.out.println(p);

    i++;
}

System.out.println(p);
   }
 }