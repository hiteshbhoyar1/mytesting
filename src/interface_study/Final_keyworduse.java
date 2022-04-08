package interface_study;

public class Final_keyworduse {
	int a=10;
	final int b=40;

	public static void main(String[] args) {
		Final_keyworduse f= new Final_keyworduse();
		f.add();

	}
	public void add() {
		 a=a+10;
		System.out.println("the addition is "+a);
		//int b=b+10; in final variable we can not update the value
		
	}

}
