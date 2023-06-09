package com.learnspring.spring_core.configrationfilebased;

public class BillProcess {
   
	
	private Ipayment ipayment;
	
	public BillProcess(Ipayment ipayment ) {
		this.ipayment=ipayment;
		System.out.println("<<<<<< Bill Process>>>>>>");
	}

	public Ipayment getIpayment() {
		return ipayment;
	}

	public void setIpayment(Ipayment ipayment) {
		this.ipayment = ipayment;
	}
	
}
