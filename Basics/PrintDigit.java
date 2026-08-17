public class PrintDigit{
	public static void main(String a[]) {
		long num = 9783815994L;
		long first = num%10; //4
		 num = num/10; //978381599
		 long second = num%10; //9
		 num = num/10; //97838159
		 long third = num%10; //9
		 num = num/10; //9783815
		 long fourth = num%10; //5
		 num = num/10; //978381
		 long fifth = num%10; //1
		 num = num/10; //97838
		 long sixth = num%10; //8
		 num = num/10; //9783
		 long seventh = num%10; //3
		 num = num/10; //978
		 long eighth = num%10; //8
		 num = num/10; //97
		 long nineth = num%10; //7
		 num = num/10; //9
		 long tenth = num%10; //9
		 

		 System.out.println(first);
		 System.out.println(second);
		 System.out.println(third);
		 System.out.println(fourth);
		 System.out.println(fifth);
		 System.out.println(sixth);
		 System.out.println(seventh);
		 System.out.println(eighth);
		 System.out.println(nineth);
		 System.out.println(tenth);


	}
}
