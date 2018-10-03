package com.capgemini.cust;

import com.capgemini.bank.BankAccount;
import com.capgemini.bank.CurrentAccount;
import com.capgemini.bank.CurrentAccountInsurance;
import com.capgemini.bank.SavingsAccount;
import com.capgemini.bank.SavingsAccountInsurance;

public class Customer {
	public static void main(String[] args)
	{
		//structure of BankAccount and implementation of SavingsAccount
		BankAccount acc1=null;
		acc1=new SavingsAccount();
		acc1.deposit(7000);
		acc1.withdraw(5000);
		BankAccount acc2=null;
		acc2=new CurrentAccount();
		acc2.withdraw(5000);
		System.out.println("Bank Account 1(SavingsAccount) "+acc1);
		System.out.println("Bank Account 2 (CurrentAccount)"+acc2);
		
		SavingsAccountInsurance savingAcc=new SavingsAccountInsurance();
		System.out.println(savingAcc.getInsuranceName());
		System.out.println(savingAcc.getInsuranceId());
		System.out.println(savingAcc.getInsuranceAmount());
		
		CurrentAccountInsurance currentAcc=new CurrentAccountInsurance();
		System.out.println(currentAcc.getInsuranceName());
		System.out.println(currentAcc.getInsuranceId());
		System.out.println(currentAcc.getInsuranceAmount());
		
		
	}


}
