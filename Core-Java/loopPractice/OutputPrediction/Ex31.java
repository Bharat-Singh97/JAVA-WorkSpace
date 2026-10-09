/* Output
i = 1
j = 3
mul = 3
i = 2
j = 3
mul =8  
i = 3 
j = 3
mul = 19 
*/


public class Ex31{
	public static void main(String[] args) {

int mult = 1;
int i = 1;

while (i <= 3) {
    int j = 1;

    while (j <= 2) {
        mult = mult * j;
        j++;
    }

    mult = mult + i;

    System.out.println("i = " + i);
    System.out.println("j = " + j);
    System.out.println("mult = " + mult);

    i++;
}

      }

       }

