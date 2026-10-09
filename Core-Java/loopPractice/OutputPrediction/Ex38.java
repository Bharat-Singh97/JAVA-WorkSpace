/* Output
i = 0
a = 1
b = 8
i = 1
a = 4
b = 9
i = 2
a = 3
b = 10
*/


public class Ex38{
	public static void main(String[] args) {
int a = 4;
int b = 7;
int i = 0;

while (i < 3) {
    a = (a + b) % 5;
    b = b + 1;

    System.out.println("i = " + i);
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    i++;
}

      }

       }

