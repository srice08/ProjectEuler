/*
 * Stephen L. Rice
 * ProjectEuler
 * December 23, 2013
 * 
 * Test the PrimeFactors library class
 */

package test.primality;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PrimeFactorsTest
{
	//Test the static get primes method
	@Test
	public void testGetPrimes()
	{
		//Test prime factors of 0
		long number = 0;
		List<Long> factors = new ArrayList<Long>();
		org.junit.Assert.assertEquals(factors, primality.PrimeFactors.getPrimes(number));
		
		//Test prime factors of a small number
		number = 546;
		factors = new ArrayList<Long>();
		factors.add(new Long(2));
		factors.add(new Long(3));
		factors.add(new Long(7));
		factors.add(new Long(13));
		org.junit.Assert.assertEquals(factors, primality.PrimeFactors.getPrimes(number));
		
		//Test prime factors of a large number
		number = 56787890;
		factors = new ArrayList<Long>();
		factors.add(new Long(2));
		factors.add(new Long(5));
		factors.add(new Long(5678789));
		org.junit.Assert.assertEquals(factors, primality.PrimeFactors.getPrimes(number));
		
		//Test prime factors of a prime number
		number = 123457;
		factors = new ArrayList<Long>();
		factors.add(new Long(123457));
		org.junit.Assert.assertEquals(factors, primality.PrimeFactors.getPrimes(number));
		
		//Test prime factors of a negative number
		number = -546;
		factors = new ArrayList<Long>();
		factors.add(new Long(-1));
		factors.add(new Long(2));
		factors.add(new Long(3));
		factors.add(new Long(7));
		factors.add(new Long(13));
		org.junit.Assert.assertEquals(factors, primality.PrimeFactors.getPrimes(number));
		
	}

}
