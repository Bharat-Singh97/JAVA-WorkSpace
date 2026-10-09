/* Output
i = 0
sum = 3
i = 1
sum = 8
i = 2
sum = 15 

*/

public class Ex23{
	public static void main(String[] args) {

int sum = 0;
int i = 0;

while (i < 3) {
    int j = 2;

    while (j > 0) {
        sum += i + j;
        j--;
    }

    System.out.println("i = " + i);
    System.out.println("sum = " + sum);

    i++;
}

       }

 }