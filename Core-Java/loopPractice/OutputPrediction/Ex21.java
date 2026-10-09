/* Output
i = 3
x = 9
i = 2
x = 13
i = 1
x = 14
*/

public class Ex21{
	public static void main(String[] args) {

int x = 0;
int i = 3;

while (i > 0) {
    x = x + i * i;

    System.out.println("i = " + i);
    System.out.println("x = " + x);

    i--;
}

       }

 }