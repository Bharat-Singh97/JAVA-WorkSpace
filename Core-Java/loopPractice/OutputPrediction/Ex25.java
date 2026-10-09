/* Output
score = 35
count = 1
score = 20
count = 2
score = 5 
count = 3
*/

public class Ex25{
	public static void main(String[] args) {

int count = 0;
int score = 50;

while (score >= 10) {
    score = score - 15;
    count = count + 1;

    System.out.println("score = " + score);
    System.out.println("count = " + count);
}

       }

 }