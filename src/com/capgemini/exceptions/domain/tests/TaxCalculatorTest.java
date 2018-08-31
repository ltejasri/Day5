package com.capgemini.exceptions.domain.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.exceptions.domain.EmployeeInvalidException;
import com.capgemini.exceptions.domain.TaxCalculator;
import com.capgemini.exceptions.domain.TaxNotEligibleException;

class TaxCalculatorTest {
	
	@Test
	void testEmployeeInvalidException() throws Exception
	{
	assertThrows(EmployeeInvalidException.class,()->TaxCalculator.calculateTax("",true,30000));
	assertThrows(EmployeeInvalidException.class,()->TaxCalculator.calculateTax("reddy",true,1000));
}}


	
