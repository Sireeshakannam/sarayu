package com.icici.loans.carloans;

public class HDFC  implements Rbi {

	public static void main(String[] args) {

	HDFC h= new HDFC();

	
	h.withdrawl();
	h.deposit();
	
	}
	
	

	@Override
	public void withdrawl() {
		
		System.out.println("i am withdrawl overriden in ICICI");
		
	}

	@Override
	public void deposit() {
		
		
	System.out.println("i am deposit overriden in ICICI");
	
	}
	
}
