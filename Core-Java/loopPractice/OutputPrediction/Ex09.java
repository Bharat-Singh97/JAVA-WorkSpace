
/*
6
4
10
3
13
2
infinite loop
*/

public class Ex09{
	public static void main(String[] args) {
int value = 1;
int step = 5;

while (value < 20) {
    value = value + step;
    step = step - 1;

    System.out.println(value);
    System.out.println(step);
}

System.out.println(value);
System.out.println(step);
   }
 }