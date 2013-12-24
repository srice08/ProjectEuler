/**
 * 	Stephen Rice
 *	ProjectEuler.net
 *	December 23, 2013
 *
 *	This class tests the Sieve of Eratosthenes
 */

package test.primality;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SieveOfEratosthenesTest
{

	//Tests static getPrimes method
	@Test
	public void testGetPrimes()
	{
		//Check all primes less than 10
		long limit = 10;
		List<Long> actualPrimes = new ArrayList<Long>();
		actualPrimes.add(new Long(2));
		actualPrimes.add(new Long(3));
		actualPrimes.add(new Long(5));
		actualPrimes.add(new Long(7));
		org.junit.Assert.assertEquals(actualPrimes, primality.SieveOfEratosthenes.getPrimes(limit));
		
		//Check to ensure that passing a negative value returns an empty list
		limit = -20;
		actualPrimes = new ArrayList<Long>();
		org.junit.Assert.assertEquals(actualPrimes, primality.SieveOfEratosthenes.getPrimes(limit));
		
		//Check to ensure that passing 0 returns an empty list
		limit = 0;
		org.junit.Assert.assertEquals(actualPrimes, primality.SieveOfEratosthenes.getPrimes(limit));
		
	}

}
