// In this its modified the and put in order value which are unique not remove elements output array {1,2,4,6,3,6}
import java.util.Arrays;
public class removeElement{
	

  public static int removeElement(int[] arr, int val){

  int cnt = 0;

  for(int i = 0; i < arr.length; i++){
  if(arr[i] != val){
  arr[cnt] = arr[i];
  cnt++;
      }
    }

    return cnt;
 

   }


	public static void main(String[] args){

	int[] arr = {1,2,3,4,3,6};
	int val = 3;

	int [] original = Arrays.copyOf(arr, arr.length);
	System.out.println("Original Array : " + Arrays.toString(original));

	int uniqueElementExceptVal=removeElement(arr, val);
	System.out.println("Unique Elements Except Val count : " +uniqueElementExceptVal);
	System.out.println(Arrays.toString(arr));


	}
}