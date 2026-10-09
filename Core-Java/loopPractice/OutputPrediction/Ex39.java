/* Output
i = 1
current = 2
i = 2
current = 10
i = 3
current = 37
i = 4
current = 101
*/


public class Ex39{
	public static void main(String[] args) {
int current = 1;
int i = 1;

while (i <= 4) {
    current = current + (i * i * i);

    System.out.println("i = " + i);
    System.out.println("current = " + current);

    i++;
}

      }

       }

