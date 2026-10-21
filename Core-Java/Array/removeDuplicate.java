import java.util.Arrays;

public class removeDuplicate{
	
	public static int removeDuplicate(int[] arr){
        
        // Handle an empty array
		if(arr.length == 0){
			return 0;
		}

           
     // i tracks the last unique element's position
     int i = 0;


     // j scans the array from the second element
	for(int j = 1; j<arr.length; j++){

    // Found a new unique element
	if(arr[i] != arr[j]){
	i++;
	arr[i]=arr[j];
	}
	}

    // Number of unique elements
	return i+1;

	}


	public static void main(String[] args){

	int[] arr = {1,1,2,2,3,4};

	int[] original = Arrays.copyOf(arr, arr.length);
	System.out.println("Original Array: " + Arrays.toString(original));


	int result = removeDuplicate(arr);
	System.out.println("Numbers of Uniques Elements in array :" + result);
	





	}
}