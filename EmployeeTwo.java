
public class EmployeeTwo {
    //instance variable 
	int empno;
	float salary;
	String name;

	//constructor with parameters passing => overloading constructors
	
//	EmployeeTwo(int empno, String name){//local variables
//	 instance var. 	this.empno = empno; //local var
//		this.name = name;
//	}
	
//	EmployeeTwo(int empno,String name,float salary) { 
//		System.out.println("******");	
//                  this.empno = empno; 
//	                this.name = name; 
	//instead of above two lines u can write as constructor chaining below line
//	                this(empno, name);
                
//	                this.salary = salary;
//	}

	
	//constructor with no parameters passing
	EmployeeTwo() {
	System.out.println("******");
	
  empno = 23; 
 name = "Toofan"; 
 salary = 345.09f;
	 	}

	
	void getDetails() {

		
		//for overloading it is always good practice to us "this"
		//System.out.println(this.name + " | " +this.empno + " | " +this.salary);
		System.out.println(name + " | " + empno + " | " + salary);
	}

}
