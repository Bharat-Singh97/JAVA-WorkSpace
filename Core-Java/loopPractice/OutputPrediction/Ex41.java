/* Output
i = 1
j = 4
subTotal = 3
grandTotal = 3
i = 2
j = 4
subTotal = 6 
grandTotal = 9
i = 3
j = 4
subTotal = 9
grandTotal = 18 
*/


public class Ex41{
	public static void main(String[] args) {
int grandTotal = 0;
int i = 1;

while (i <= 3) {
    int subTotal = 0;
    int j = 1;

    while (j <= 3) {
        subTotal += i;
        j++;
    }

    grandTotal += subTotal;

    System.out.println("i = " + i);
    System.out.println("j = " + j);
    System.out.println("subTotal = " + subTotal);
    System.out.println("grandTotal = " + grandTotal);

    i++;

}

      }

       }

