/**
 * 	Stephen Rice
 *	ProjectEuler.net
 *	December 22, 2013
 *
 *	This class tests the common_math library functions
 */

package test.primality;

import static org.junit.Assert.*;
import org.junit.Test;

public class CommonMathTest
{

	@Test
	public void testEUC()
	{
		//Testing 0
		long u = 0;
		long v = 0;
		org.junit.Assert.assertEquals("Testing 0 values", 0, primality.common_math.euc(u, v));
		
		//Testing max bound
		u = java.lang.Long.MAX_VALUE;
		v = java.lang.Integer.MAX_VALUE;
		org.junit.Assert.assertEquals("Testing large values that have no gcd", 1, primality.common_math.euc(u,v));
		
		//Testing large values
		u = java.lang.Long.MAX_VALUE/3 + 1;
		v = java.lang.Short.MAX_VALUE - 1;
		org.junit.Assert.assertEquals("Testing large values that have a gcd", 129, primality.common_math.euc(u,v));		
	}

	@Test
	public void testLCM()
	{
		//Testing 0
		long u = 0;
		long v = 0;
		org.junit.Assert.assertEquals("Testing 0 values", 0, primality.common_math.lcm(u, v));
		
		//Testing large values
		u = 47666005358422614L;
		v = 129;		
		org.junit.Assert.assertEquals("Testing large values", 2049638230412172402L, primality.common_math.lcm(u,v));

	}

}
