package com.encapsulation;
public class LoanApplication {
	private String customerName;
	private double loanAmount;
	private double intrestRate;
	private int loanTerm;
	private double outstandingBalance;
	public LoanApplication(String customerName,double loanAmount,double intrestRate,int loanTerm) {
		this.customerName=customerName;
		this.loanAmount=loanAmount;
		this.intrestRate=intrestRate;
		this.loanTerm=loanTerm;
		this.outstandingBalance=loanAmount;
		System.out.println("Loan Application Submitted");
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount=loanAmount;
		this.outstandingBalance=loanAmount;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setIntrestRate(double intrestRate) {
		this.intrestRate=intrestRate;
	}
	public double getIntrestRate() {
		return intrestRate;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm=loanTerm;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public void setOutstandingBalance(double outstandingBalance) {
		this.outstandingBalance=outstandingBalance;
	}
	public double getOutstandingBalance() {
		return outstandingBalance;
	}
	public void makePayment(double amount) {
		if(amount<=0) {
			System.out.println("Invalid Payment Amount");
		}
		else if (amount>=outstandingBalance) {
			System.out.println("Payment exceeds loan balance");
		}
		else {
			outstandingBalance=outstandingBalance-amount;
			System.out.println("Payment received of:"+amount+" and remiaing balance is:"+outstandingBalance);
		}
	}
	public double calculateEMI() {
	    double monthlyRate = intrestRate / (12 * 100);
	    int totalMonths = loanTerm * 12;
	    double emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, totalMonths)) /
	                 (Math.pow(1 + monthlyRate, totalMonths) - 1);
	    return emi;
	}
	public void displaydetails() {
		System.out.println("LoanAmount:"+loanAmount);
		System.out.println("Intrest Rate:"+intrestRate);
		System.out.println("EMI:"+calculateEMI());
		outstandingBalance+=calculateEMI();
		System.out.println("Outstanding Balance is:"+outstandingBalance);
	}
	public static void main(String[] args) {
		LoanApplication loan=new LoanApplication("John",45000,2,2);
		loan.displaydetails();
		loan.makePayment(5000);
	}
}
