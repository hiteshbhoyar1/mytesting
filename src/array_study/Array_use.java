package array_study;

import java.util.Arrays;

public class Array_use {

	public static void main(String[] args) {
		// declaration
		String name[]=new String[3];
		
		//initialization
		name[0]="Hitesh";
		name[1]="Gopalrao";
		name[2]="Bhoyar";
		
		//usage
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println("====otherway======");
		
		for(int i=0; i<=name.length-1; i++) {
			System.out.println(name[i]);
			
		}
		char grade[]=new char[3];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		
		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		
		System.out.println("=====using for loop");
		for(int j=0; j<=grade.length-1; j++) {
			System.out.println(grade[j]);
		}
		int a[]=new int[5];
	    a[0]=123;
	    a[1]=145;
	    a[2]=102;
	    a[3]=110;
	    a[4]=147;
	    
	   
	    
	    System.out.println(a[0]);
	    System.out.println(a[1]);
	    System.out.println(a[2]);
	    
	    System.out.println("======using for loop=====");
	    for(int k=0; k<=a.length-1; k++) {
	    	System.out.println(a[k]);
	    }
	    System.out.println("======================");
	    Arrays.sort(a);
	    for(int l=0;l<=a.length-1;l++) {
	    	System.out.println(a[l]);
		
	}System.out.println("=========================");
	    Arrays.sort(a);
	    for(int m=a.length-1; m>=0; m--) {
	    	System.out.println(a[m]);
	    }
	    String h="Hitesh Gopalrao Bhoyar";
	    String sep=" ";
	    String[] n=h.split(sep);
	    for(int v=0; v<=n.length-1;v++) {
	    	System.out.println(n[v]);
	    }

}}
