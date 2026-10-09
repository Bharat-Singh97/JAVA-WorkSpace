/* Output
i = 0
high = 30
low = 15
i = 1
high = 15
low =  20 
i = 2
high = -5
low = 25
*/


public class Ex32{
	public static void main(String[] args) {

int high = 40;
int low = 10;
int i = 0;

while (i < 3) {
    high = high - low;
    low = low + 5;

    System.out.println("i = " + i);
    System.out.println("high = " + high);
    System.out.println("low = " + low);

    i++;
}

      }

       }

