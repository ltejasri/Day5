package com.capgemini.exceptions.domain.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.exceptions.domain.AgeNotWithinRangeException;
import com.capgemini.exceptions.domain.NameNotValidException;
import com.capgemini.exceptions.domain.Student;

class StudentTest {

	
	@Test
	void testStudent()throws NameNotValidException,AgeNotWithinRangeException {
		//	assertEquals(null,new Student(11,"Shubham",21,"Java"));
			assertThrows(AgeNotWithinRangeException.class,()-> new Student(11,"Shubham",22,"Java"));
		
	}

}
