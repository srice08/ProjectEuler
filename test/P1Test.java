/**
 * 	Stephen Rice
 *	ProjectEuler.net
 *	December 22, 2013
 *
 *	This class tests the P1 class
 */

package test;

import static org.junit.Assert.*;
import org.junit.Test;
import problems.P1;

public class P1Test
{
	//This test solves the Project Euler input and checks the answer
	@Test
	public void testSolve()
	{
		P1 problem = new P1(1000);
		problem.solve();
		
		org.junit.Assert.assertEquals(233168, problem.getSum());
	}
	
	//This test checks to ensure getSolution() returns a string representation of the answer
	@Test
	public void testGetSolution()
	{
		P1 problem = new P1(1000);
		problem.solve();
		org.junit.Assert.assertEquals("233168", problem.getSolution());
	}

}
