// move Zero to end of the array, without changing the order of non zero elements
import java.util.Arrays;
public class moveZeroes{

	public static int[] moveZeroes(int [] arr){

        int j = 0;
         
        // Non-zero elements ko aage copy karna
 
		for(int i = 0; i < arr.length; i++){
			if(arr[i] !=0){
				arr[j]=arr[i];
				j++;
			}
		}

		// Remaining positions par zero fill karna
		for(int i = j; i < arr.length; i++){
				arr[i]= 0;
	}

	return arr;
}
	public static void main(String[] args){

	int arr[] = {3,0,2,0,1,6};

     // Original array ki independent copy
	int[] original = Arrays.copyOf(arr, arr.length);
	System.out.println("Original Array: " + Arrays.toString(original));

    // Original array modify hoga
	int[] result= moveZeroes(arr);
	System.out.println("Modified Array : " + Arrays.toString(arr));

		
	}
	}
