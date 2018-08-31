package com.capgemini.exceptions.domain;

public class TaxCalculator {
	
public static double calculateTax(String empName, boolean isIndian, double empSal) throws EmployeeInvalidException, CountryNotValidException, TaxNotEligibleException
 {
	double taxAmount;
	if(isIndian == true)
	{
		if(empName == "" || empName == "null")
		{
			throw new EmployeeInvalidException("The employee name cannot be empty");
		}
		
		else if(empSal > 100000)
	{
		 taxAmount = empSal *8/100;
		return taxAmount;
	}
	else if(empSal<50000 && empSal>100000)
	{
		taxAmount =empSal *6/100;
		return taxAmount;
	}
	else if(empSal<30000 && empSal>50000)
	{
		taxAmount =empSal *5/100;
		return taxAmount;
	}
	else if(empSal<10000 && empSal>30000)
	{
		taxAmount =empSal *4/100;
		return taxAmount;
	}
	else if(empSal < 100000)
	{
		throw new TaxNotEligibleException("The employee does not need to pay tax");
	}
	else {
		throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
	}
	}
	return 0;
 }
}

