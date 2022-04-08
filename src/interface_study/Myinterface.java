package interface_study;

public class Myinterface implements Father,Mother {

	public static void main(String[] args) {
		Myinterface m= new Myinterface();
		m.looks();
		m.nature();
		m.anger();
		m.money();
	}

	@Override
	public void looks() {
		System.out.println("mothers looks completed in myinterface");
		
	}

	@Override
	public void nature() {
		System.out.println("mothers nature completed in myinterface");
		
	}

	@Override
	public void money() {
		System.out.println("Fathers money completed in myinterface");
		
		
	}

	@Override
	public void anger() {
		System.out.println("Fathers anger completed in myinterface");
		
		
	}

}
