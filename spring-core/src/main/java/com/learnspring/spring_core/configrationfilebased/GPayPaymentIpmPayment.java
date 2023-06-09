package com.learnspring.spring_core.configrationfilebased;

public class GPayPaymentIpmPayment implements Ipayment {
	
	

	public void payBill(Double amount) {
		
		System.out.println("<<<<<<<payment done with Gpay with amount>>>>>" + amount);
		
	}

}
