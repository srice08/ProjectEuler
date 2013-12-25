/*
 * Stephen L. Rice
 * Project Euler
 * December 25, 2013
 * 
 * Tests for Problem 6
 */

package test.problems;

import static org.junit.Assert.*;
import org.junit.Test;
import problems.P6;

public class P6Test
{
	//Test the solve method
	@Test
	public void testSolve()
	{
		//Test ProjectEuler value
		P6 problem = new P6(100);
		problem.solve();
		org.junit.Assert.assertEquals(25164150, problem.getAnswer());

		//Test ProjectEuler example value
		problem = new P6(10);
		problem.solve();
		org.junit.Assert.assertEquals(2640, problem.getAnswer());
	}

	//Test the getSolution method
	@Test
	public void testGetSolution()
	{
		//Test ProjectEuler value
		P6 problem = new P6(100);
		problem.solve();
		org.junit.Assert.assertEquals("25164150", problem.getSolution());

		//Test ProjectEuler example value
		problem = new P6(10);
		problem.solve();
		org.junit.Assert.assertEquals("2640", problem.getSolution());
	}

}
