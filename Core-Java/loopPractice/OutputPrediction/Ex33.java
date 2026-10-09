/* Output
i = 0
run 2= 3
i  = 1
run = 9
i = 2
run = 21
i = 3
run = 45
*/


public class Ex33{
	public static void main(String[] args) {

int run = 0;
int i = 0;

while (i < 4) {
    run = run * 2 + 3;

    System.out.println("i = " + i);
    System.out.println("run = " + run);

    i++;
}

      }

       }

