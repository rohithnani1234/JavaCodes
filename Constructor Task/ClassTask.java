package com.constructor;

public class ClassTask {
	String address;
	String customerName;
	double amount;
	public ClassTask() {
		
	}
	public ClassTask(String ad,String cn,double am) {
		address=ad;
		customerName=cn;
		amount=am;
	}
	public void printData() {
		System.out.println("Customer Name:"+customerName+"\n"+"Address:"+address+"\n"+"Amount:"+amount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassTask ct=new ClassTask("VZM","Rohith",25000);
		ct.printData();
	}

}
