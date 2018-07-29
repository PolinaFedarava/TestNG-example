package by.htp.test.simple;

import org.testng.annotations.Test;

public class SimpleGroupTestExample {
	
	@Test (groups = "simple")
	 public void testOne () {
		System.out.println("one" );
	}
	
	@Test (groups = {"simple", "complex"})
	 public void testTwo () {
		System.out.println("two" );
	}
	
	@Test (groups = {"simple", "complex"})
	 public void testTree () {
		System.out.println("three" );
	}

}
