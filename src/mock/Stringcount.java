package mock;

public class Stringcount {

	public static void main(String[] args) {
		String n="lalalajpatrao";
		String s=n.replace("a", "");
		System.out.println("the count of a is in the string is "+(n.length()-s.length()));
		
		String a= "thepassionatelovestory";
		String b=a.replace("s", "");
		System.out.println(a.lastIndexOf("o"));
		System.out.println(a.length()-b.length());
		
		String o="chandrapuristhedistrictinmaharashtrastate";
		String p=o.replace("a", "");
		System.out.println("the count of a is "+(o.length()-p.length()));
		
		String q="123654456321121";
		String w=q.replace("2", "");
		
			
		System.out.println("the count of 2 is "+(q.length()-w.length()+" times"));
	}

}
