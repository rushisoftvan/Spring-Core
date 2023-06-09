package com.learnspring.spring_core_annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BillProcess {
   
	private final Ipayment ipayment;
	
	@Autowired
	
	public BillProcess(Ipayment ipayment) {
		this.ipayment=ipayment;
	}
	
	public void payBill(Double amount) {
		ipayment.payBill(amount);
	} 
	
	
}
