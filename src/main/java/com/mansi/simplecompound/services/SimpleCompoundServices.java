package com.mansi.simplecompound.services;

public interface SimpleCompoundServices {
	/**
	 * 
	 * @param principle
	 * @param rate
	 * @param time
	 * @return simple interest
	 */
	public double simpleinterest(double principle, double rate, int time);

	/**
	 * 
	 * @param principle
	 * @param rate
	 * @param n
	 * @return compound interest
	 */
	public double compoundinterest(double principle, double rate, int n);

}
