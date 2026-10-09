
/*
50
1
25
2
12
3
6
4
6
4
*/

public class Ex12{
	public static void main(String[] args) {

int x = 100;
int count = 0;

while (x > 10) {
    x = x / 2;
    count = count + 1;

    System.out.println(x);
    System.out.println(count);
}

System.out.println(x);
System.out.println(count);


   }
 }