/* Output
i = 0
m = 19
n = 2
i = 1
m = 23
n = 1
i = 2
m = 24
n = 0
*/


public class Ex42{
	public static void main(String[] args) {
int m = 10;
int n = 3;
int i = 0;

while (i < 3) {
    m = m + (n * n);
    n = n - 1;

    System.out.println("i = " + i);
    System.out.println("m = " + m);
    System.out.println("n = " + n);

    i++;
}

      }

       }

