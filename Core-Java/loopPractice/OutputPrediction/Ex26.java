/* Output
i = 1
val = 4 
i = 2
val = 10 
i = 3
val = 33 
*/

public class Ex26{
	public static void main(String[] args) {

int val = 3;
int i = 1;

while (i <= 3) {
    val = val * i + i;

    System.out.println("i = " + i);
    System.out.println("val = " + val);

    i++;
}

       }

 }