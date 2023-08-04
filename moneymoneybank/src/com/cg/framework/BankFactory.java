package com.cg.framework;
public abstract class BankFactory 
{
	public abstract SavingAcc getNewSavingAccount(int accNo,String accNm, float accBal,boolean isSalaried);
	public abstract CurrentBank getNewCurrentBank(int accNo,String accNm, float accBal,float creditLimit);
		
}