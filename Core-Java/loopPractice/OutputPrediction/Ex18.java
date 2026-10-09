/* Output
first = 5 
second = 7
first = -2
second = 9
first = -11
second = 11
*/

public class Ex18{
	public static void main(String[] args) {

int first = 10;
int second = 5;
int i = 0;

while (i < 3) {
    first -= second;
    second += 2;

    System.out.println("first = " + first);
    System.out.println("second = " + second);

    i++;
              }

       }

 }