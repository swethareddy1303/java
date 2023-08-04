package com.cg.client;
import com.cg.application.MMSavingAcc;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMBankFactory;
import com.cg.framework.SavingAcc;
import com.cg.framework.CurrentBank;
import com.cg.framework.BankFactory;
public class Client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		
		
		SavingAcc sa = new MMSavingAcc(123,"Nandu",15000, true);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		
		CurrentBank cb = new MMCurrentAcc(1000,"Sriyu",20000,1500);
		cb.deposit(cb.getCreditLimit());
		cb.toString();
		

	}
}