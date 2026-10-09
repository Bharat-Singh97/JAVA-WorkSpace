/* Output
product = 2
k = 2
product = 6 
k = 3
product = 24 
k = 4
product = 120
k = 5
final k = 6
*/

public class Ex20{
	public static void main(String[] args) {

int k = 2;
int product = 1;

while (product < 30) {
    product = product * k;

    System.out.println("product = " + product);
    System.out.println("k = " + k);

    k = k + 1;
}

System.out.println("Final k = " + k);
       }

 }