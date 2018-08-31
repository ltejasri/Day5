package com.capgemini.exceptions.domain.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.exceptions.domain.Factorial;
import com.capgemini.exceptions.domain.FactorialException;

class FactorialTest {

	@Test
	void testGetFactorial() throws Exception {
		Factorial f1=new Factorial() ;
		assertThrows(FactorialException.class,()->f1.getFactorial(100));
		assertEquals(120,f1.getFactorial(5));
	}

}
