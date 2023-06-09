package com.learnspring.spring_core.configrationfilebased;

public class DebiteCardpaymentImpOfIpayment implements Ipayment {
	
	public DebiteCardpaymentImpOfIpayment(){
		System.out.println("<<<<< DebiteCardpaymentImpOfIpayment  Const>>>>>");
	}

	public void payBill(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("payment is done with amount :"+ amount);
	}

}
