/* Output
i = 0
p = 2
q = 8
i = 1
p = 3
q = 6
i = 2
p = 4
q = 3

*/

public class Ex24{
	public static void main(String[] args) {

int p = 4;
int q = 9;

p = q % p;

int i = 0;

while (i < 3) {
    q = q - p;
    p = p + 1;

    System.out.println("i = " + i);
    System.out.println("p = " + p);
    System.out.println("q = " + q);

    i++;
}

       }

 }