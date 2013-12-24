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

import primality.PrimeFactors;

//TODO: Add tests for PrimeFactors class (non static functions);
public class PrimeFactorsTest
{
	//Test the static get primes method
	@Test
	public void testGetStaticPrimes()
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
	
	//Test PrimeFactors constructor
	@Test
	public void testPrimeFactors()
	{
		//Test to ensure all variables are set correctly
		PrimeFactors primes = new PrimeFactors(new Long(123456), true, 100);
		org.junit.Assert.assertEquals(new Long(123456), primes.getFactNum());
		org.junit.Assert.assertEquals(true, primes.getUseSieve());
		org.junit.Assert.assertEquals(100, primes.getSieveSize());
	}
	
	//Test PrimeFactors solve
	@Test
	public void testSolve()
	{
		//Sieve not used
		PrimeFactors primes = new PrimeFactors(new Long(123456), false, 100);
		List<Long> factors = new ArrayList<Long>();
		factors.add(new Long(2));
		factors.add(new Long(2));
		factors.add(new Long(2));
		factors.add(new Long(2));
		factors.add(new Long(2));
		factors.add(new Long(2));
		factors.add(new Long(3));
		factors.add(new Long(643));
		org.junit.Assert.assertEquals(factors, primes.getPrimes());
		
		//Sieve used, size 0
		primes = new PrimeFactors(new Long(123456), true, 0);
		//Use same factors from earlier test
		org.junit.Assert.assertEquals(factors, primes.getPrimes());
		
		//Sieve used, size 100
		primes = new PrimeFactors(new Long(123456), true, 100);
		//Use same factors from earlier test
		org.junit.Assert.assertEquals(factors, primes.getPrimes());
		
		//Sieve used, size 999
		primes = new PrimeFactors(new Long(123456), true, 999);
		//Use same factors from earlier test
		org.junit.Assert.assertEquals(factors, primes.getPrimes());
		
		//Sieve used, size 1000, prime greater than sieve numbers
		primes = new PrimeFactors(new Long(56787890), true, 1000);
		factors = new ArrayList<Long>();
		factors.add(new Long(2));
		factors.add(new Long(5));
		factors.add(new Long(5678789));
		org.junit.Assert.assertEquals(factors, primes.getPrimes());
	}
}
