public class Array2d {

	// print 2d array or display element in matrix form

	public static void DisplayArrayElements(int arr[][]){

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j]+ " ");
			}

			System.out.println();
		}
	}

	//SumOfArrayElements
	public static int SumOfArrayElements(int arr[][]){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j <arr[i].length; j++){
				sum +=arr[i][j];
			}
		}

		return sum;
	}


	public static int [][] AddTwoMatrices(int [][] a , int [][] b){
		int [][] sum = new int[a.length][a[0].length];

		for(int i = 0; i < a.length; i++){
			for(int j = 0; j <a[i].length; j++){
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

		return sum;
	} 



// main method

	public static void main(String[] args) {

		int arr[][] = {{20,30}, {30,40}, {40,50}};
		DisplayArrayElements(arr);
		int sum = SumOfArrayElements(arr);
		System.out.println("Sum of array elements is: " + sum);


		int [][] a = {{10,20}, {5,7}};
		int [][] b = {{5,7}, {10,20}};

		int [][] c = AddTwoMatrices(a,b);
		DisplayArrayElements(c);
	}
}