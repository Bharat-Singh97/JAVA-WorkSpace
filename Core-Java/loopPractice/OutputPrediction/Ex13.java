
/*
1
1
1
2
1
2
2
2
4
3
1
5
3
2
7
3
3
10
10
*/

public class Ex13{
	public static void main(String[] args) {

int sum = 0;
int i = 1;

while (i <= 3) {
    int j = 1;

    while (j <= i) {
        sum += j;

        System.out.println(i);
        System.out.println(j);
        System.out.println(sum);

        j++;
    }

    i++;
}

System.out.println(sum);
   }
 }