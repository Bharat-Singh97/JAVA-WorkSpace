/* Output
i = 0
in = 2
out = 0
i = 1
in = 2
out = 2
i = 2
in = 2
out = 6
*/

public class Ex17{
	public static void main(String[] args) {

int out = 0;
int i = 0;

while (i < 3) {
    int in = 2;
    out = out + in * i;

    System.out.println("i = " + i);
    System.out.println("in = " + in);
    System.out.println("out = " + out);

    i++;
              }

       }

 }