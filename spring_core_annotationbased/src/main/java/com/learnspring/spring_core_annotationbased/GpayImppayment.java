package com.learnspring.spring_core_annotationbased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GpayImppayment implements Ipayment {
	
	
	public GpayImppayment() {
		System.out.println("GpayImppayment ::: constructor");
	}

	public void payBill(Double amount) {
       System.out.println("payment is done by gpay with amount : " + amount);		
	}

}
