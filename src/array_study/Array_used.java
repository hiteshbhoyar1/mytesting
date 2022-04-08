package array_study;

public class Array_used {

	public static void main(String[] args) {
		// split method using whitespace
		String k= "Hitesh Gopalrao Bhoyar";
		String sep= " ";
		String[] l= k.split(sep);
		System.out.println(l[0]);
		System.out.println(l[1]);
		System.out.println(l[2]);
		System.out.println("===========");
		// split by using underscroll
		String h= "Hitesh_Gopalrao_Bhoyar";
		String sep1= "_";
		String[] required = h.split(sep1);
		System.out.println(required[0]);
		System.out.println(required[1]);
		System.out.println(required[2]);
		
		System.out.println("===========");
		String hi = "Lenscart_India_Private _Limited";
		String sep2 = "_";
		String[] req =hi.split(sep2);
		System.out.println(req[0]);
		System.out.println(req[1]);
		System.out.println(req[2]);
		System.out.println(req[3]);
		System.out.println("===========");
		
		String hit = "Amazon,India,Biggest,Online,Market";
		String sep3= ",";
		String[] req1 = hit.split(sep3);
		System.out.println(req1[0]);
		System.out.println(req1[1]);
		System.out.println(req1[2]);
		System.out.println(req[3]);
		System.out.println("===========");
		
		String hite = "Flipkart/Big/Billion/Day";
		String sep4= "/";
		String[] req2 = hite.split(sep4);
		System.out.println(req2[0]);
		System.out.println(req2[1]);
		System.out.println(req2[2]);
		System.out.println(req2[3]);
		
		System.out.println("===========");
		String jk = "The Big Bull";
		String sep5= " ";
		String[] hash = jk.split(sep5);
		System.out.println(hash[0]);
		System.out.println(hash[1]);
		System.out.println(hash[2]);
		

	}

}

