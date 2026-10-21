import java.util.Arrays;

public class movesZerosBruteforce{

public static void  movesZerosBruteforce(int arr[]){
	int n = arr.length;
	int temp[] = new int[n];

	int j = 0;
    
     // Step 1: Copy all non-zero elements

	for(int i = 0; i < n; i++){
	if(arr[i] !=0){
	temp[j]=arr[i];
	j++;
	}
	}

    // Step 2: Copy the temporary array back

	for(int i = 0 ; i < n; i++){
	arr[i] = temp[i];
	}
}


	
public static void main (String [] args){
	int[] arr = {0,3,5,0,7,6};

	int [] original = Arrays.copyOf(arr, arr.length);
	System.out.println("Origianl " + Arrays.toString(original));

	movesZerosBruteforce(arr);
	System.out.println("Modified array " + Arrays.toString(arr));
}

}

/*Zero fill karne ka separate loop kyun nahi hai? Java mein int array ke elements default 0 hote hain. Isliye temp mein non-zero elements copy karne ke baad remaining positions already zero hoti hain.
3. Dry run
Input: [0, 1, 0, 3, 12]
Step	temp array
Initially	[0, 0, 0, 0, 0]
Copy 1	[1, 0, 0, 0, 0]
Copy 3	[1, 3, 0, 0, 0]
Copy 12	[1, 3, 12, 0, 0]
Final output: [1, 3, 12, 0, 0]
4. Complexity comparison
Approach	Time	Auxiliary Space
Brute Force — extra array	O(n)	O(n)
Optimized — Two Pointers	O(n)	O(1)
*/