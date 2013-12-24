/*
 * Stephen L. Rice
 * ProjectEuler
 * December 23, 2013
 * 
 * Test the P2 class
 */

package test.problems;

import static org.junit.Assert.*;
import org.junit.Test;
import problems.P2;

public class P2Test
{
	//Test the solve function
	@Test
	public void testSolve()
	{
		//Test ProjectEuler value
		long expectedValue = 4613732;
		P2 problem = new P2();
		problem.solve();
		org.junit.Assert.assertEquals(expectedValue, problem.getSum());
	}
	
	//Test the getSolution function
	@Test
	public void testGetSolution()
	{
		String expected = "4613732";
		P2 problem = new P2();
		problem.solve();
		org.junit.Assert.assertEquals(expected, problem.getSolution());
	}

}
