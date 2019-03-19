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
		double compoundinterestresult = 0.0;
		compoundinterestresult = (principle * Math.pow((1 + rate / 100.0), n)) - principle;
		return compoundinterestresult;
	}

}
