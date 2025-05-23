package com.encapsulation;

public class CreditCardAccount {
	private String customerName;
	private double creditLimit;
	private double currentDebt;
	private double intrestRate;
	public CreditCardAccount(String customerName,double creditLimit,double currentDebt,double intrestRate) {
		this.customerName=customerName;
		this.creditLimit=creditLimit;
		this.currentDebt=currentDebt;
		this.intrestRate=intrestRate;
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit=creditLimit;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCurrentDebt(double currentDebt) {
		this.currentDebt=currentDebt;
	}
	public double getCurrentDebt() {
		return currentDebt;
	}
	public void setIntrestRate(double intrestRate) {
		this.intrestRate=intrestRate;
	}
	public double getIntrestRate() {
		return intrestRate;
	}
	public void swipeCard(double amount) {
		if(amount==creditLimit) {
			System.out.println("Transaction declined Limit exceeded");
		}else {
			currentDebt=amount+currentDebt;
			System.out.println("Amount taken:"+amount);
			System.out.println("Current Debt:"+currentDebt);
		}
	}
	public void makePayment(double amount) {
		if(amount>currentDebt) {
			System.out.println("Excess payment not allowed");
		} else {
			currentDebt=currentDebt-amount;	
			System.out.println("Paid Amount:"+amount);
			System.out.println("Current Debt:"+currentDebt);
		}
	}
	public void applyIntrest() {
		currentDebt=currentDebt+(currentDebt*(intrestRate/100));
		System.out.println("Current Debt with intrest is:"+currentDebt);
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer name:"+customerName+"\nCredit Limit:"+creditLimit+"\nCurrent Debt:"+currentDebt+"\nIntrestRate:"+intrestRate;
	}
	public static void main(String[] args) {
		CreditCardAccount card=new CreditCardAccount("John", 1000, 5000, 0.8);
		System.out.println(card);
		card.swipeCard(500);
		card.makePayment(1450);
		card.applyIntrest();
	}
}
