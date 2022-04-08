package variable_datatypes;

public class Employee_info {
	//name ---> string
	//emp code----> int
	//emp grade----> grade
	//emp salary---> float
	
	String Emp_Name; // declaring global non-static variable 
	int Emp_code;
	char Emp_grade;
	float Emp_sal;
	
public void employee() {
	System.out.println("=============================");
	System.out.println("Employee name is "+Emp_Name);
	System.out.println("Employee code is "+Emp_code);
	System.out.println("the Employee grade is "+Emp_grade);
	System.out.println("the Employee salary is "+Emp_sal);
}
}
