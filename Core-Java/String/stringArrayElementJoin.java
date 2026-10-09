class stringArrayElementJoin{
	
	public static void main(String [] args) {

	String friends[] = {"Kareena" , " Raveena", " Akshay", "Manoj"};

	// Kareena-Raveena-Akshay-Manoj


	String result = String.join("-",friends);
	System.out.println(result);
	}
}