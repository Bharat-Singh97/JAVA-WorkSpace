
/*
1
3
2
9
3
18
4
30
30
*/

public class Ex03{
	public static void main(String[] args) {
int count = 1;
int total = 0;

while (count < 5) {
    total += count * 3;

    System.out.println(count);
    System.out.println(total);

    count++;
}

System.out.println(total);



   }
 }