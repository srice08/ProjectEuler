/*
 * Stephen L. Rice
 * ProjectEuler
 * December 25, 2013
 * 
 * Tests for problem 7
 */

package test.problems;

import static org.junit.Assert.*;
import org.junit.Test;
import problems.P7;

public class P7Test
{

	@Test
	public void testSolve()
	{
		//Test Project Euler solution
		P7 problem = new P7(10001);
		problem.solve();
		org.junit.Assert.assertEquals(104743, problem.getAnswer());
		
		//Test Project Euler example 
		problem = new P7(6);
		problem.solve();
		org.junit.Assert.assertEquals(13, problem.getAnswer());
	}

	@Test
	public void testGetSolution()
	{
		//Test Project Euler solution
		P7 problem = new P7(10001);
		problem.solve();
		org.junit.Assert.assertEquals("104743", problem.getSolution());
		
		//Test Project Euler example 
		problem = new P7(6);
		problem.solve();
		org.junit.Assert.assertEquals("13", problem.getSolution());
	}

}
