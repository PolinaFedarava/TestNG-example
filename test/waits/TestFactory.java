package by.htp.test.waits;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import by.htp.test.simple.SimpleGroupTestMaskExample;

public class TestFactory {
	
	@Test 
	@Factory
	public Object [] factoryObjects() {
		Object [] tests = new Object [] {
				new SimpleGroupTestMaskExample(),
				new TestWaitExample () 
				};
		return tests;
		
	}
}
