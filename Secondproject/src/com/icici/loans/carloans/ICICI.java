package com.icici.loans.carloans;

public class ICICI implements Rbi {

	public static void main(String[] args) {
		ICICI i=new ICICI();
		i.deposit();
i.withdrawl();
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