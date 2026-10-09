/* Output
i = 1
acc = 100 
i = 2
acc = 50
i = 3 
acc = 16
*/


public class Ex43{
	public static void main(String[] args) {
int acc = 100;
int i = 1;

while (i <= 3) {
    acc = acc / i;

    System.out.println("i = " + i);
    System.out.println("acc = " + acc);

    i++;
}

      }

       }

