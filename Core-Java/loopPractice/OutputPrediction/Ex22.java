/* Output
i = 0
a = 4
b = 2
i = 1
a = 2
b = 0
*/

public class Ex22{
	public static void main(String[] args) {

int a = 6;
int b = 12;
int i = 0;

while (i < 2) {
    b = b / a;
    a = a - 2;

    System.out.println("i = " + i);
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    i++;
}

       }

 }