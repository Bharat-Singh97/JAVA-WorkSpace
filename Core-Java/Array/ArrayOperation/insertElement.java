import java.util.Arrays;

public class insertElement{
	
	public static void main(String[] args) {

	int[] arr = {1,2,4,5,6};
	System.out.println(Arrays.toString(arr));

	int[] arr1 = new int[arr.length+1];

	int position = 2;
	int value = 3;

	for(int i = 0; i < position; i++){
		arr1[i] = arr[i];
	}

	arr1[position] = value;

	for(int i = position; i < arr.length; i++){
		arr1[i+1] = arr[i];
	}

	System.out.println(Arrays.toString(arr1));

	
	}
}