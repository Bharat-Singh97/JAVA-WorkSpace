/* Output
index = 1
sum = 1
index = 3 
sum =  10
index = 5
sum = 35
*/


public class Ex45{
	public static void main(String[] args) {
int index = 1;
int sum = 0;

while (index <= 5) {
    sum += index * index;

    System.out.println("index = " + index);
    System.out.println("sum = " + sum);

    index += 2;
}
      }
  }


