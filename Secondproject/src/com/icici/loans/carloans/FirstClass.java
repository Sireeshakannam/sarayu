package com.icici.loans.carloans;

public class FirstClass {
	int a=10,b=20,c=0;
	public void add()
	{
		c=a+b;
		System.out.println("addition of A & B is:"+c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("subtraction of A & B is:"+c);
	}
	

	public static void main(String[] args) {
		System.out.println("Hello!");

FirstClass obj=new FirstClass();
		
		obj.add();
		obj.sub();
FirstClass obj1=new FirstClass();
		
		obj1.add();
		obj1.sub();
		
	}

}
