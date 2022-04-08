package mock;

public class ReverseStringwithoutchangingindex {

	public static void main(String[] args) {
        String str="Ganesh Jadhav";
		
		String ar[]=str.split(" ");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String rev = ar[i];
			String rev1="";
			for(int j=rev.length()-1; j>=0; j--)
			{
				rev1=rev1+rev.charAt(j);
				//System.out.print(rev.charAt(j));
			}
			System.out.print(rev1+" ");
		}

	}

}
