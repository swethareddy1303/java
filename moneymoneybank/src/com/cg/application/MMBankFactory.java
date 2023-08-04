package com.cg.application;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentBank;
import com.cg.framework.SavingAcc;
public class MMBankFactory extends BankFactory
		{
			public MMSavingAcc getNewSavingAcc(int accNo, String accNm,float accBal, boolean isSalaried) {
			MMSavingAcc mmsaving = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
			return mmsaving;
			
		}
		public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm,float accBal, float creditLimit) {
			MMCurrentAcc mmcurrent= new MMCurrentAcc(accNo,  accNm, accBal,  creditLimit);
			return mmcurrent;
			
		}
		@Override
		public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public CurrentBank getNewCurrentBank(int accNo, String accNm, float accBal, float creditLimit) {
			// TODO Auto-generated method stub
			return null;
		}

	}