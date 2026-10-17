// without this keyword because When the parameter //and instance variable have different names, the //instance variable can be accessed without this. 

class Student {
	
	String name;
	int age;

	Student(String StudentName, int StudentAge){
	name = StudentName;
	age = StudentAge;

	}

	void display(){
	System.out.println("Name: "+ name);
	System.out.println("Age: "+ age);

	}


public static void main(String[] args){
	
	Student s1= new Student("Bharat", 25);
	Student s2= new Student("Vinod", 26);

	s1.display();
	s2.display();
}

}