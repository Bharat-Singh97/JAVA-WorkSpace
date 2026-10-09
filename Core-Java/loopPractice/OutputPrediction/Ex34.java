/* Output
i = 0
next = 2 
a = 1
b = 2
i = 1
next = 3 
a = 2
b = 3
i = 2
next = 5 
a = 3
b = 5
i = 3
next = 8 
a = 5
b = 8
*/


public class Ex34{
	public static void main(String[] args) {

int a = 1;
int b = 1;
int i = 0;

while (i < 4) {
    int next = a + b;
    a = b;
    b = next;

    System.out.println("i = " + i);
    System.out.println("next = " + next);
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    i++;
}

      }

       }

