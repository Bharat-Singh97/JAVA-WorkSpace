public class Ex15{
	public static void main(String[] args){
	int x = 1;
    int y = 1;

while (x < 3) {
    y = 1;
    while (y < 4) {
        System.out.println(x);
        y = y + 1;
    }
    x = x + 1;
}


	}
}

/* Output
1
1
1
2
2
2

*/
