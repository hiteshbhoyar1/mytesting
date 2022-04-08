package array_study;

import java.util.ArrayList;

public class Reversearray1 {

	public static void main(String[] args) {
		String s= "Hi I Am Velocity";
		String s1[]=s.split(" ");
		for(int i=s1.length-1;i>=0;i--) {
			System.out.print(s1[i]+" ");
			
		}
		System.out.println("========");
		ArrayList ar = new ArrayList<>();
		ar.add("Hi");
		ar.add(0, "I");
		ar.add(0, "Am");
		ar.add(0, "Velocity");
		System.out.println(ar);
	}

}
