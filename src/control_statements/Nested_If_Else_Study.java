package control_statements;

public class Nested_If_Else_Study {
	// if the username is correct then please enter password, if your password is correct then "login success" welcome
	

	public static void main(String[] args) {
		String Username= "HiteshB@";
		String Password= "Hitesh123";
				if(Username== "HiteshB@") {
				System.out.println("Username is correct, please enter your Password");
				
				if(Password=="Hitesh123") {
					System.out.println("Login success welcome to Meta");
					
					
					}
				else {
					System.out.println("The password is incorrect please check it");
				}
				}
				else {
					System.out.println("Username is incorrect");
				}

	}

}
