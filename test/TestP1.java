/*
	Stephen Rice
	TestP1.java
	Written on October 4, 2013
	
	Tests output for P1.java

	To Run: java -cp .:test/junit.jar:test/hamcrest-core.jar org.junit.runner.JUnitCore test.TestP1
*/

package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestP1
{
	
	@Test
	public void testEuler()
	{
		P1 problem = new P1(1000);
		
		assertEquals("ProjectEuler Problem One returns an answer of 233168", 233168, problem.solve());
		System.out.println("Totally testing stuff");
	}
}
