package com.mansi.simplecompound;

import com.mansi.simplecompound.services.SimpleCompoundServices;

/**
 * Simple and Compound Interest
 *
 */
public class App {
	private SimpleCompoundServices simplecompoundService;

	public App(SimpleCompoundServices simplecompoundService) {

		this.simplecompoundService = simplecompoundService;

	}

	public double calculation(int x) {
		double answer = 0.0;
		if (x == 1) {
			answer = simplecompoundService.simpleinterest(50000, 6, 2);
		} else if (x == 2) {
			answer = simplecompoundService.compoundinterest(40000, 5, 2);
		}
		return answer;
	}
}
