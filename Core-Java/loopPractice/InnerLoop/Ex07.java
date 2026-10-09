public class Ex07{
	public static void main(String[] args){
	int i = 1;
    int j = 1;

while (i <= 3) {
    j = 1;
    while (j <= 3) {
        System.out.println(i + j);
        j = j + 1;
    }
    i = i + 1;
}

	}
}

/* Output
2
3
4
3
4
5
4
5
6
*/