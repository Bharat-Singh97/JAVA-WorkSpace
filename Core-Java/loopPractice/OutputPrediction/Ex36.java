/* Output
i = 0 
points = 10
level = 4
i = 1
points = 18 
level = 3
i = 2 
points = 24 
level = 2

*/


public class Ex36{
	public static void main(String[] args) {

int level = 5;
int points = 0;
int i = 0;

while (i < 3) {
    points += level * 2;
    level = level - 1;

    System.out.println("i = " + i);
    System.out.println("points = " + points);
    System.out.println("level = " + level);

    i++;

}

      }

       }

