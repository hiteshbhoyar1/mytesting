package control_statements;

import java.util.Scanner;

public class If_study1 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
		int age;
		System.out.println("enter the age");
		try (Scanner s = new Scanner(System.in)) {
			age= s.nextInt();
		} 
		if(age>=18) {
				
				System.out.println("you are eligible for voting");
				
			}
		
		}
		
		}
		

	}


