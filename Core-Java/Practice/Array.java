public class Array{


 
   // ForwardOrder
    public static void ForwardOrder(int [] arr){
    
    for(int i = 0; i< arr.length; i++){
    System.out.print(arr[i]+ ",");
    }
    System.out.println();

    }


 //  BackwardOrder
    public static void BackwardOrder(int []  arr){

    
    for(int i=arr.length-1; i >= 0; i--){
    System.out.print(arr[i] + ",");
    }

        System.out.println();

    }

    // SumOfArrayElements

    public static int SumOfArrayElements(int[] arr1){
    	int sum = 0;

    	for(int i = 0; i < arr1.length; i++){
    		sum +=arr1[i];
    	}

    	return sum;
    }

    // Average of array element 

    public static double AverageOfArrayElements(int [] arr1) {
    	int cnt = 0;
    	for(int i = 0; i < arr1.length; i++){
    		cnt++;
    	}
    	 return (double)SumOfArrayElements(arr1) / (double)cnt;
    }

    // SumOfOddElements

    public static int SumOfOddElements(int [] arr2) {
    	int sum = 0; // SumOfOddElements

    	for(int i = 0; i < arr2.length; i++) {
    		if(arr2[i] % 2 != 0){
    			System.out.print(arr2[i] + " ");
    			sum +=arr2[i];
    		}

    	}
    	System.out.println();
    	return sum;
    }



  //  Main method
	public static void main(String[] args){

	int [] arr = {2,5,11,9};
	int[] arr1 = {5,8,12,6};

	
	ForwardOrder(arr);
	BackwardOrder(arr);
	int sum = SumOfArrayElements(arr1);

	System.out.println("Sum Of Array Elements is: "+sum );

	double average = AverageOfArrayElements(arr1);
	System.out.println("Average Of Array Elements is :" +average);

	int[] arr2 = {5,7,6,9,2};

	int sumOfOddElements = SumOfOddElements(arr2);
	System.out.println("Sum Of Odd Elements is: "+ sumOfOddElements);



	}
}