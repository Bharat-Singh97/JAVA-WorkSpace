public class Ex08{
	public static void main(String[] args){
	int i = 1;
    int j = 1;
    int k = 1;

while (i <= 5) {
    j = 1;
    while (j <= 5) {
        System.out.println(j);
        j = j + 1;
    }

    k = 1;
    while (k <= 5) {
        System.out.println(k);
        k = k + 1;
    }
    System.out.println();
    i++;
}


	}
}

/* Output
1
2
3
4
5
1
2
3
4
5

1
2
3
4
5
1
2
3
4
5

1
2
3
4
5
1
2
3
4
5

1
2
3
4
5
1
2
3
4
5

1
2
3
4
5
1
2
3
4
5
*/