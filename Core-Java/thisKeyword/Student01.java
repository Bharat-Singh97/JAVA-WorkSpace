// Using this keyword because When the parameter //and instance variable have same names, the //instance variable can't be accessed without this. 

class Student01 {
	
	String name;
	int age;

	Student01(String name, int age){
	this.name = name;
	this.age = age;

/* withou this output E:\JAVA-WorkSpace\Core-Java\thisKeyword>java Student01
Name: null
Age: 0
Name: null
Age: 0 */
	}

	void display(){
	System.out.println("Name: "+ name);
	System.out.println("Age: "+ age);

	}


public static void main(String[] args){
	
	Student01 s1= new Student01("Bharat", 25);
	Student01 s2= new Student01("Vinod", 26);

	s1.display();
	s2.display();
}

}