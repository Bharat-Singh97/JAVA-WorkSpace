import java.util.Arrays;

public class deleteElement{
	
	public static void main(String[] args) {

	int[] arr = {1,2,4,5,6};
	System.out.println(Arrays.toString(arr));

	int[] arr1 = new int[arr.length - 1];

	int position = 2;


	for(int i = 0; i < position; i++){
		arr1[i] = arr[i];
	}


	for(int i = position; i < arr1.length; i++){
		arr1[i] = arr[i+1];
	}

	System.out.println(Arrays.toString(arr1));

	
	}
}