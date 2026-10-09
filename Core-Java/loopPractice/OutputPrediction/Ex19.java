/* Output
i = 1
i % 2 = 1
total = 2
i = 2
i % 2 = 0 
total = 2
i =  3
i % 2 = 1 
total = 3
i = 4
i % 2 = 0 
total = 3
*/

public class Ex19{
	public static void main(String[] args) {

int total = 1;
int i = 1;

while (i <= 4) {
    total = total + (i % 2);

    System.out.println("i = " + i);
    System.out.println("i % 2 = " + (i % 2));
    System.out.println("total = " + total);

    i++;
              }

       }

 }