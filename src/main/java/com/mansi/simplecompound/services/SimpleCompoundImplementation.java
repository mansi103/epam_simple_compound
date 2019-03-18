package com.mansi.simplecompound.services;

public class SimpleCompoundImplementation implements SimpleCompoundServices {
	@Override
	public double simpleinterest(double principle, double rate, int time) {
		// TODO Auto-generated method stub
		double simpleinterestresult = 0.0;
		simpleinterestresult = (principle * rate * time) / 100.0;
		return simpleinterestresult;
	}

	@Override
	public double compoundinterest(double principle, double rate, int n) {
		// TODO Auto-generated method stub
		double compoundinterestresult = 0.0;
		compoundinterestresult = principle * Math.pow((1 + rate / 100.0), n);
		return compoundinterestresult;
	}

}
