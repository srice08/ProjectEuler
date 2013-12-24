/*
 * Stephen L. Rice
 * ProjectEuler
 * December 24, 2013
 * 
 * Unit tests for P3
 */

package test.problems;

import static org.junit.Assert.*;
import org.junit.Test;
import problems.P3;

public class P3Test
{
	//Test the solve value
	@Test
	public void testSolve()
	{
		//ProjectEuler Value
		long num = 600851475143L;
		P3 problem = new P3(num);
		problem.solve();
		Long factor = new Long(6857);
		org.junit.Assert.assertEquals(factor, problem.getFactor());
	}
	
	//Test the get solution
	@Test
	public void testGetSolution()
	{
		long num = 600851475143L;
		P3 problem = new P3(num);
		problem.solve();
		String solution = "6857";
		org.junit.Assert.assertEquals(solution, problem.getSolution());
		
	}

}
