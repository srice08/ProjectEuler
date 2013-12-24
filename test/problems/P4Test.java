/*
 * Stephen L. Rice
 * ProjectEuler
 * December 24, 2013
 * 
 * Test P4
 */

package test.problems;

import static org.junit.Assert.*;
import org.junit.Test;
import problems.P4;

public class P4Test
{
	//Test Project Euler palindrome
	@Test
	public void testSolve()
	{
		P4 problem = new P4(999, 100);
		problem.solve();
		long factOne = 913;
		long factTwo = 993;
		long palindrome = 906609;
		org.junit.Assert.assertEquals(factOne, problem.getFactorOne());
		org.junit.Assert.assertEquals(factTwo, problem.getFactorTwo());
		org.junit.Assert.assertEquals(palindrome, problem.getPalindrome());
	}
}
