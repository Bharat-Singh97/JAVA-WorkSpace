class StringbuilderVsStringbuffer{
	public static void main(String [] args) {

	StringBuffer sb1 = new StringBuffer("Kareena");
	long startTime1 = System.currentTimeMillies();
	for(int i = 1; i <= 1000000; i++)
	sb1.append("Kapoor");
	long endTime1 = System.currentTimeMillies();
	

	StringBuilder sb2 = new StringBuilder("Raveena");
	long startTime2 = System.currentTimeMillies();
	for(int i = 1; i <= 1000000; i++)
	sb2.append("Tandon");
	long endTime2 = System.currentTimeMillies();
	

	System.out.println("Time require for StringBuffer " +(endTime1-startTime1) +" ms");
	System.out.println("Time require for StringBuilder " +(endTime2-startTime2) +" ms");

	}
}