package variable_datatypes;

public class HR {

	public static void main(String[] args) {
		Employee_info HiteshB= new Employee_info();
		HiteshB.Emp_Name="Hitesh Bhoyar";
		HiteshB.Emp_code=1002;
		HiteshB.Emp_grade='A';
		HiteshB.Emp_sal=65000.2365f;
		HiteshB.employee();
		
		Employee_info Rahul= new Employee_info();
		Rahul.Emp_Name="Rahul kadu";
		Rahul.Emp_code=100;
		Rahul.Emp_grade='C';
		Rahul.Emp_sal=1236.1222f;
		Rahul.employee();
		
		Employee_info Arvind= new Employee_info();
		Arvind.Emp_Name="Arvind Bodhe";
		Arvind.Emp_code=1265;
		Arvind.Emp_grade='B';
		Arvind.Emp_sal=2500.325f;
		Arvind.employee();
		
		Employee_info Sachin= new Employee_info();
		Sachin.Emp_Name="Sachin Parkhi";
		Sachin.Emp_code=0140;
		Sachin.Emp_grade='A';
		Sachin.Emp_sal=25000.236f;
		Sachin.employee();
	}

}
