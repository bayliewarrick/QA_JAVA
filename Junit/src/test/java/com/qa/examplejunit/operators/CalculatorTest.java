package com.qa.examplejunit.operators;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	@Test
	public void addTest() {
		double result = Calculator.add(1.0, 2.5);
		assertEquals(3.5, result);
	}
	
	@Test
	public void subTest() {
		double result = Calculator.sub(5.0, 3.5);
		assertEquals(1.5, result);
	}
	
	@Test
	public void divTest() {
		double result = Calculator.div(5.0, 2.0);
		assertEquals(2.5, result);
	}
	
	@Test
	public void mulTest() {
		double result = Calculator.mul(5.0, 2.0);
		assertEquals(10.0, result);
	}
	
	@Test
	public void remTest() {
		double result = Calculator.rem(2.0, 2.0);
		assertEquals(0.0, result);
	}
	
}
