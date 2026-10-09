public class Ex09{
	public static void main(String[] args){
	int i = 1;
    int j = 1;
    int k = 1;

while (i <= 3) {
    j = 1;
    while (j <= 3) {
        k = 1;
        while (k <= 3) {
            System.out.println(i + " " + j + " " + k);
            k = k + 1;
        }
        j = j + 1;
    }
    System.out.println();
    i = i + 1;
}




	}
}

/* Output
1 1 1
1 1 2
1 1 3
1 2 1
1 2 2
1 2 3
1 3 1 
1 3 2 
1 3 3

2 1 1 
2 1 2 
2 1 3
2 2 1
2 2 2 
2 2 3
2 3 1
2 3 2
2 3 3

3 1 1
3 1 2 
3 1 3
3 2 1
3 2 2
3 2 3 
3 3 1
3 3 2 
3 3 3
*/