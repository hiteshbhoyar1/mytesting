package control_statements;

public class Nested_if_else1 {

	public static void main(String[] args) {
		String shirt="Casual shirt";
		char size='L';
		int no=42;
		String pay="G-pay";
		long card_no=8983708744l;
		String password="hitesh134";
		String done= "Payment successful";
		
		if(shirt=="Casual shirt") {
			System.out.println("type of shirt is confirm ");
			System.out.println("please select the size");
			if(size=='L') {
				System.out.println("the size is available please select the number");
				
			if(no==42) {
				System.out.println("if the size is selected then proceed to payment method");
				if(pay=="G-pay") {
					System.out.println("if the payment method is correct then please input the card number");
					if(card_no==8983708744l) {
						System.out.println("if the card number is correct then enter the password");
						if(password=="hitesh134") {
							System.out.println("if the password is correct ");
							if(done=="Payment successful") {
								System.out.println("show the payment successful message");
							}else {
								System.out.println("payment decline");
							}
								
						}else {
							System.out.println("wrong password");
						}
					}else {
						System.out.println("enter valid card number");
					}
				}else {
					System.out.println("please select varified payment method");
				}
			}else {
				System.out.println("the shirt number is unavailable");
			}
			}else {
			   System.out.println("the size is out of stock");
			}
		}else {
			System.out.println("shirt type is not mentioned in the list");
		}

	}

}
