/**
 * 	Stephen Rice
 *	ProjectEuler.net
 *	December 22, 2013
 *
 *	This class tests the P1 class constructors, solve and solution methods
 */

package test;

import static org.junit.Assert.*;
import org.junit.Test;
import problems.P1;

public class P1Test
{
	//Ensures that the value passed into the function is the value that is tested
	@Test
	public void testP1()
	{
		//ProjectEuler
		int value = 1000;
		P1 problem = new P1(value);
		org.junit.Assert.assertEquals("Constructor Test", value, problem.getMaxVal());
		
		//Value out of upper bound
		problem = new P1(java.lang.Integer.MAX_VALUE + 1);
		org.junit.Assert.assertEquals("Numbers that are too large should be set to -1", -1, problem.getMaxVal());
		
		//Value out of lower band
		problem = new P1(-1);
		org.junit.Assert.assertEquals("Numbers that are negative should bet set to -1", -1 , problem.getMaxVal());
	}
	
	//Check the solve method for ProjectEuler value, min and max
	@Test
	public void testSolve()
	{
		//Project Euler
		P1 problem = new P1(1000);
		problem.solve();
		org.junit.Assert.assertEquals("ProjectEuler Value Solve test", 233168, problem.getSum());
		
		//Minimum
		problem = new P1(0);
		problem.solve();
		org.junit.Assert.assertEquals("Testing minimum", 0, problem.getSum());
		
		//Negative Number
		problem = new P1(-1);
		problem.solve();
		org.junit.Assert.assertEquals("Testing negative", -1 , problem.getSum());
		
	}
	
	//Checks to ensure getSolution() returns a string representation of the answer
	@Test
	public void testGetSolution()
	{
		P1 problem = new P1(1000);
		problem.solve();
		org.junit.Assert.assertEquals("233168", problem.getSolution());
	}

}
