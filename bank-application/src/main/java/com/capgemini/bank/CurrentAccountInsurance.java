package com.capgemini.bank;

public class CurrentAccountInsurance extends CurrentAccount implements Insurance{

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Unknown Current Insurance Name";
	}

	@Override
	public String getInsuranceId() {
		// TODO Auto-generated method stub
		return "Current Insurance Id";
	}

	@Override
	public double getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
