class App{

public static void main(String [] args) {

Person p1 = new Person();

// default value 
p1.displayPerson();

//assign value
p1.name = "Bharat Singh Panwar";
p1.mobile = 9783815994L;
p1.education = "B.tech CSE";

p1.displayPerson();
p1.eat();
p1.run();
p1.study();

	
}

}