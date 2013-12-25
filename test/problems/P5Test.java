/*
 *Stephen L. Rice
 *ProjectEuler
 *December 25, 2013
 *
 * Test Problem 5 
 */

package test.problems;

import static org.junit.Assert.*;
import org.junit.Test;
import problems.P5;

public class P5Test
{
	//Test the solve method
	@Test
	public void testSolve()
	{
		//Problem Euler value
		P5 problem = new P5(1, 20);
		problem.solve();
		org.junit.Assert.assertEquals(232792560, problem.getSmallestNum());
		
		//Problem Euler example value
		problem = new P5(1, 10);
		problem.solve();
		org.junit.Assert.assertEquals(2520, problem.getSmallestNum());
	}

	//Test the getSolution method
	@Test
	public void testGetSolution()
	{
		//Test ProjectEuler Value
		P5 problem = new P5(1, 20);
		problem.solve();
		org.junit.Assert.assertEquals("232792560", problem.getSolution());
	}

}
