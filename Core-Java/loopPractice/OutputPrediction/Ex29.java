/* Output
i = 1
ans = 1
i = 2
ans = 4
i = 3
ans = 9
i = 4
ans = 16
i = 5
ans = 25
Final ans = 25
*/

public class Ex29{
	public static void main(String[] args) {

int ans = 0;
int i = 1;

while (i <= 5) {
    ans += (i * 2) - 1;

    System.out.println("i = " + i);
    System.out.println("ans = " + ans);

    i++;
}

System.out.println("Final ans = " + ans);
}

       }

