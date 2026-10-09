/* Output
i = 1
val = 0
i = 2
val = 0
i = 3
val = 0
*/


public class Ex37{
	public static void main(String[] args) {
int val = 10;
int i = 1;

while (i <= 3) {
    val = val - (val / i);

    System.out.println("i = " + i);
    System.out.println("val = " + val);

    i++;
}

      }

       }

