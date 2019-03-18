package com.mansi.simplecompound;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.mansi.simplecompound.services.SimpleCompoundImplementation;

/**
 * Unit test for simple App.
 */
public class AppTest

{
	private static App app;

	/**
	 * 
	 * Setting up instance of the class
	 * 
	 * @throws Exception
	 * 
	 */

	@BeforeClass

	public static void BeforeClass() throws Exception {

		app = new App(new SimpleCompoundImplementation());

	}

	/**
	 * 
	 * method to test simple interest
	 * 
	 */

	@Test

	public void SimpleInterest() {

		assertEquals(6000.0, app.calculation(1), 0.0);

	}

	/**
	 * 
	 * method to test coumpound interest
	 * 
	 */

	@Test

	public void CompoundInterest() {

		assertEquals(44100.0, app.calculation(2), 0.0);

	}

}
