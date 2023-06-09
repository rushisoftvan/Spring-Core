package com.learnspring.spring_core_annotationbased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("debite")
//@Primary
public class DebiteCardpaymentImpOfIpayment implements Ipayment {
	
	
	public DebiteCardpaymentImpOfIpayment() {
		System.out.println("DebiteCardpayment : : : constructor");
	}

	public void payBill(Double amount) {
	System.out.println("payment is done by DebiteCardpayment for the amount  : " + amount);
	}

}
