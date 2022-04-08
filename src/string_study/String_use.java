package string_study;

public class String_use {

	public static void main(String[] args) {
		//without using new keyword
		String a="Hitesh";
		String b="Hitesh";
		System.out.println("the output of == is "+(a==b));
		System.out.println("the output of equals is "+a.equals(b));
		System.out.println("==================================");
		
		//using new keyword
		String c=new String ("Hitesh");
		String d=new String ("Hitesh");
		System.out.println("the output of == is "+(c==d));
		System.out.println("the output of equals is "+c.equals(d));
		System.out.println("==================================");
		
		//determining the length
		String e="Communication";
		String f="Tendulkar";
		System.out.println("the length of e is "+e.length());
		System.out.println("the length of f is "+f.length());
		System.out.println("==================================");
		
		//use of upper case and lower case
		String g="aspire";
		String h="ASPIRE";
		System.out.println(g.toUpperCase());
		System.out.println(h.toLowerCase());
		
		System.out.println("==================================");
		
		//use of equalsIgnoreCase
		String i="Hitesh";
		String j="vijay";
		System.out.println("the output of equalsIgnoreCase is "+i.equalsIgnoreCase(j));
		System.out.println("==================================");
		
		//use of contains
		String k="Hitesh";
		System.out.println("the output of a contains is "+k.contains("te"));
		System.out.println(k.contains("sh"));
		System.out.println(k.contains("st"));
		System.out.println("==================================");
		
		//use of isEmpty and isBlank
		String l="";
		String m=" ";
		String n="Hitu";
		System.out.println("l is blank? "+l.isBlank());
		System.out.println("m is blank? "+m.isBlank());
		System.out.println("n is blank? "+n.isBlank());
		System.out.println("l is empty? "+l.isEmpty());
		System.out.println("m is empty? "+m.isEmpty());
		System.out.println("==================================");
		
		//use of charAt
		String o="Ahmadnagar";
		System.out.println("the charAt is "+o.charAt(7));
		System.out.println("the charAt is "+o.charAt(9));
		System.out.println("=====================================");
		
		//use of end with and starts with
		String p="Nagpur";
		System.out.println("the p starts with "+p.startsWith("Nag"));
		System.out.println("the p endswith "+p.endsWith("pur"));
		System.out.println("============================");
		
		//use of substring
		String q="Independance";
		System.out.println("the substring is "+q.substring(5));
		System.out.println("the substring is "+q.substring(2,10));
		
		//use of concat 
		String r= "Hitesh ";
		String s="Sanket ";
		String t="Ameya ";
		String u="Tanmay ";
		String v="Parshu ";
		System.out.println("the concat is "+r.concat(s).concat(t).concat(u).concat(v));
		System.out.println("=============================");
		
		//use of index of and last index of 
		String finalString= r.concat(s).concat(t).concat(u).concat(v);
		System.out.println("output of indexof is "+finalString.indexOf('a'));
		System.out.println("output of lastindexof is "+finalString.lastIndexOf('a'));
		
		//use of replace
		System.out.println("the output of replace is "+finalString.replace('e', 'a'));
		
		String w="NITIN";
		System.out.println("the output of replace is "+w.replace("NITIN", "SACHIN"));
		
		
	}

}
