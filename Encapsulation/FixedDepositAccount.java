package com.encapsulation;

public class FixedDepositAccount {
	private String customerName;
	private double principalAmount;
	private double intrestRate;
	private int duration;
	private double maturityAmount;
	public FixedDepositAccount(String customerName,double principalAmount,double intrestRate,int duration,double maturityAmount) {
		this.customerName=customerName;
		this.principalAmount=principalAmount;
		this.intrestRate=intrestRate;
		this.duration=duration;
		this.maturityAmount=maturityAmount;
		System.out.println("Fixed Deposit Created Successfully");
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount=principalAmount;
	}
	public double getPrincipalAmount() {
		return principalAmount;
	}
	public void setIntrestRate(double intrestRate) {
		this.intrestRate=intrestRate;
	}
	public double getIntrestRate() {
		return intrestRate;
	}
	public void setDuration(int duration) {
		this.duration=duration;
	}
	public int getDuration() {
		return duration;
	}
	public void setMaturityAmount(double maturityAmount) {
		this.maturityAmount=maturityAmount;
	}
	public double getMaturityAmount() {
		return maturityAmount;
	}
	public double calculateMaturityAmount() {
		return principalAmount*Math.pow(1+(intrestRate/100), duration);
	}
	public void withdrawBeforeMaturity(int yearsCompleted) {
		if(yearsCompleted<=1) {
			System.out.println("Cannot withdraw before oneyear");
		} 
		else {
			double currentAmount=principalAmount*Math.pow(1+(intrestRate/100), duration);
			double penalty=currentAmount*0.02;
			double payOut=currentAmount-penalty;
			System.out.println("Penalty is:"+penalty);
			System.out.println("PayOut Amount is:"+payOut);
		}
		
	}
	public static void main(String[] args) {
		FixedDepositAccount fixed=new FixedDepositAccount("John", 1000, 2, 2, 500);
		double maturity=fixed.calculateMaturityAmount();
		System.out.println(maturity);
		fixed.withdrawBeforeMaturity(1);
		
	}
}
