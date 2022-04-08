package variable_datatypes;

public class HR1 {

	public static void main(String[] args) {
		Employee_info1 h= new Employee_info1();
		h.Emp_name="Hitesh Bhoyar";
		h.Emp_grade='A';
		h.Emp_id=1021;
		h.Emp_sal=25312.21f;
		
		Employee_info1 a= new Employee_info1();
		a.Emp_name="Arvind Bodhe";
		a.Emp_grade='A';
		a.Emp_id=1201;
		a.Emp_sal=25631.235f;
		
		Employee_info1 r= new Employee_info1();
		r.Emp_name="Rahul Thombare";
		r.Emp_grade='A';
		r.Emp_id=1245;
		r.Emp_sal=30256.124f;
		
		Employee_info1 k= new Employee_info1();
		k.Emp_name="Ketan Thombare";
		k.Emp_grade='A';
		k.Emp_id=1452;
		k.Emp_sal=32561.25f;
		
		
		h.employee();
		a.employee();
		r.employee();
		k.employee();
		
		

	}

}
