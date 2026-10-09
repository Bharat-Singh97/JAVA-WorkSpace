
/*
1
1
2
5
3
14
14
*/

public class Ex07{
	public static void main(String[] args) {
int result = 0;
int i = 1;

while (i <= 3) {
    result = result + (i * i);

    System.out.println(i);
    System.out.println(result);

    i++;
}

System.out.println(result);
   }
 }