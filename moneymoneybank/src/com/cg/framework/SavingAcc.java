package com.cg.framework;

public class SavingAcc extends BankAcc{
	private boolean isSalaried;
	private static final float MINBAL=0;
	
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	public void withdraw(float accBal) {
		System.out.println("Balance is: "+ accBal);
	}
	@Override
	public String toString() {
		return "SavingAcc [isPrime=" + isSalaried + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
