
/*
0
3
1
8
2
22
3
63
63
*/

public class Ex15{
	public static void main(String[] args) {

int m = 1;
int i = 0;

while (i < 4) {
    m = m * 3 - i;

    System.out.println(i);
    System.out.println(m);

    i++;
}

System.out.println(m);
   }
 }