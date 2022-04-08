package control_statements;

public class Switch_study1 {

	public static void main(String[] args) {
		int year=1995;
		switch (year) {
		case 1993:System.out.println("This is not my birth year");
			break;
		case 1994:System.out.println("this is my birth year ");
		break;
		case 1995:System.out.println("this is the year when i am one year old");
		break;
		

		default:System.out.println("enter the valid key");
			break;
		}
	}

}
