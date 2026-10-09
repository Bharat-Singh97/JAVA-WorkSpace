public class Ex11{
	public static void main(String[] args){
	for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 5; j++) {
        System.out.println("I:" + i + " J:" + j);
    }

    for (int k = 1; k <= 3; k++) {
        System.out.println("K:" + k);
    }

    System.out.println();
}

	}
}

/* Output
I:1 J:1 
I:1 J:2 
I:1 J:3 
I:1 J:4 
I:1 J:5
K:1
K:2
K:3

I:2 J:1 
I:2 J:2 
I:2 J:3 
I:2 J:4 
I:2 J:5
K:1
K:2
K:3


I:3 J:1 
I:3 J:2 
I:3 J:3 
I:3 J:4 
I:3 J:5
K:1
K:2
K:3

I:4 J:1 
I:4 J:2 
I:4 J:3 
I:4 J:4 
I:4 J:5
K:1
K:2
K:3
I:5 J:1 
I:5 J:2 
I:5 J:3 
I:5 J:4 
I:5 J:5
K:1
K:2
K:3

*/
