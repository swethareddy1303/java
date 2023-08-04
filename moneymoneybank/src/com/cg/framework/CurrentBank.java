package com.cg.framework;

public class CurrentBank extends BankAcc {
protected final float creditLimit;
	

	public CurrentBank(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	public float getCreditLimit() {
		return creditLimit;
	}

	public void withdraw(float creditLimit) {
		System.out.println("the Credit Limit is: "+ creditLimit);
	}

	@Override
	public String toString() {
		return "CurrentBank [creditLimit=" + creditLimit + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
