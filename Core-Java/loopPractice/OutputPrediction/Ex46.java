/* Output
i = 0
alpha = 10 
beta = 4
i = 1
alpha = 40 
beta = 8
i = 2
alpha = 320 
beta = 16

*/


public class Ex46{
	public static void main(String[] args) {
int alpha = 5;
int beta = 2;
int i = 0;

while (i < 3) {
    alpha = alpha * beta;
    beta = beta + beta;

    System.out.println("i = " + i);
    System.out.println("alpha = " + alpha);
    System.out.println("beta = " + beta

    i++;

}
      }
  }


