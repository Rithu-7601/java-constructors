/* Base class Person */
class Person
{
	void message()
	{
		System.out.println("This is person class");
	}
}

/* Subclass Student */
class Student extends Person
{
	void message()
	{
		System.out.println("This is student class");
	}

	// Note that display() is only in Student class
	void display()
	{
		// will invoke or call current class message() method
        this.message();

		// will invoke or call parent class message() method
		super.message();
	}
}


public class SuperwithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();

		// calling display() of Student
		s.display();
	

	}

}
//output
//This is student class
//This is person class