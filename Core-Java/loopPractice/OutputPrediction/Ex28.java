/* Output
i = 0
u = 5
v = 2
i = 1
u = 7
v = 5
i = 2
u = 12
v =  7
*/

public class Ex28{
	public static void main(String[] args) {

int u = 2;
int v = 3;
int i = 0;

while (i < 3) {
    u = u + v;
    v = u - v;

    System.out.println("i = " + i);
    System.out.println("u = " + u);
    System.out.println("v = " + v);

    i++;
}

       }

 }