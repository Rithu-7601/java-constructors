/* Base class vehicle */
class Vehicle
{
	int maxSpeed = 120;
}

/* sub class Car extending vehicle */
class Car extends Vehicle
{
	int maxSpeed = 180;

	void display()
	{
		/* print maxSpeed of base class (vehicle) */
		System.out.println("Maximum Speed: " +super.maxSpeed);//try with this.maxSpeed and maxSpeed
	}
}



public class SuperwithVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car small = new Car();
		small.display();
	}

}
//output
//Maximum Speed: 120