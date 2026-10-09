/* Output
i = 0
star = 100 
i = 1
start = 95  
i = 2
start = 85 
i = 3
start = 70 

*/

public class Ex27{
	public static void main(String[] args) {

int start = 100;
int i = 0;

while (i < 4) {
    start = start - i * 5;

    System.out.println("i = " + i);
    System.out.println("start = " + start);

    i++;
}

       }

 }