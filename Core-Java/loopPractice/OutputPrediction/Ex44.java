/* Output
i = 0
power = 2
i = 1
power = 4 
i = 2
power = 8
i = 3
power =  16
i = 4
power = 32
Final power = 32
*/


public class Ex44{
	public static void main(String[] args) {
int base = 2;
int power = 1;
int i = 0;

while (i < 5) {
    power = power * base;

    System.out.println("i = " + i);
    System.out.println("power = " + power);

    i++;
}

System.out.println("Final power = " + power);

}
      }


