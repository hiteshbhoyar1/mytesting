package exceptions;

public class ClassNotFound {

	public static void main(String[] args) {
		try 
		{ Class<?> s = Class.forName("com.sql.jdbc.driver");
		System.out.println(s);
			
		} 
		catch (ClassNotFoundException e)
		{
			System.out.println("check that class is present or not ");
		}
		
		finally {
			System.out.println("run anyway");
		}
	}

}
