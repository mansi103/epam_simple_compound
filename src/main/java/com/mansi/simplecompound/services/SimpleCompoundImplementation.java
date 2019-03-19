package com.mansi.simplecompound.services;

public class SimpleCompoundImplementation implements SimpleCompoundServices {
	/**
	* Simple interest Formula = (P*R*T)/100
	*/
	@Override
	public double simpleinterest(double principle, double rate, int time) {
		double simpleinterestresult = 0.0;
		simpleinterestresult = (principle * rate * time) / 100.0;
		return simpleinterestresult;
	}
	/**
	* Compound interest formula = P * Math.pow((1 + r/n),nt) - P
	*/
	@Override
	public double compoundinterest(double principle, double rate, int n) {
		double amountresult = 0.0;
		double compoundinterestresult = 0.0;
		amountresult = principle * Math.pow((1 + rate / 100.0), n);
		compoundinterestresult = amountresult - principle;
		return compoundinterestresult;
	}

}
