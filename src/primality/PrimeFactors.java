/*
	Stephen Rice
	PrimeFactors.java
	
	Written September 26th, 2013
	
	Return the Prime Factors for a number
*/

package primality;

import primality.SieveOfEratosthenes;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//TODO: How does this work with negative numbers? Should the prime factors of -3 be -1 and 3? 
//Should 1 be included in the list of prime factors?

public class PrimeFactors
{
	//Static function to the first X primes
	public static List<Long> getPrimes(Long inNum)
	{
		if(inNum == 0)
		{
			return new ArrayList<Long>();
		}
		
		Long factNum = 0L;
		factNum = inNum;
		List<Long> factors = new ArrayList<Long>();
		
		ArrayList<Long> startingPrimes = (ArrayList<Long>) SieveOfEratosthenes.getPrimes(1000);
		
		//Check the sieve primes
		for(int i = 0; i < startingPrimes.size(); i++)
		{
			if(factNum % startingPrimes.get(i) == 0)
			{
				factNum = factNum / startingPrimes.get(i);
				factors.add(startingPrimes.get(i));
			}
		}
		
		//Check all remaining primes
		for(int i = startingPrimes.get(startingPrimes.size() - 1).intValue(); i <= (int) Math.sqrt(factNum); i++)
		{
			if(factNum % i == 0)
			{
				factNum = factNum / i;
				factors.add(new Long(i));
			}
		}
		
		//If factNum is not 1 at the end, then it is also prime
		if(factNum != 1)
		{
			factors.add(factNum);
		}
		
		//Sort Factors
		Collections.sort(factors);
		return factors;
	}
	
	
	//Class Variables
	private List<Long> sievePrimes;
	List<Long> factors;
	private Long factNum = 0L;
	private boolean isSolved;
	private boolean useSieve;
	private long sieveSize;
	
	//Customizable prime factors class that allows user to choose whether or not to choose a sieve as well as its size
	public PrimeFactors(Long inNum, boolean inSieve, long inSize)
	{
		factNum = inNum;
		isSolved = false;
		useSieve = inSieve;
		sieveSize = inSize;
		
		factors = new ArrayList<Long>();
	}
	
	private void solve()
	{
		//NumSieves is the number of sieve primes (if a sieve is used) or is set to 2, the smallest primes
		long numSieves = 3;
		
		//Use the sieve for the first primes under sieveSize
		if(useSieve)
		{
			//Retrieve Sieves
			sievePrimes = SieveOfEratosthenes.getPrimes(sieveSize);
		
			//Set the starting point for the trial division to the last sieve number
			numSieves = sievePrimes.get(sievePrimes.size() - 1);
		
			//Check the sieve primes
			for(int i = 0; i < sievePrimes.size(); i++)
			{
				while(factNum % sievePrimes.get(i) == 0)
				{
					factNum = factNum / sievePrimes.get(i);
					factors.add(sievePrimes.get(i));
				}
			}
		}
		//If sieve is not used, remove all multiplicties of 2
		else
		{
			while(factNum % 2 == 0)
			{
				factNum = factNum / 2;
				factors.add(new Long(2));
			}
		}
		
		//Check all remaining primes starting from 3 (no sieve) or the last sieve number. Increase by 2 (odds)
		for(long i = numSieves; i <= (int) Math.sqrt(factNum); i+=2)
		{
			if(factNum % i == 0)
			{
				factNum = factNum / i;
				factors.add(new Long(i));
			}
		}
		
		//If factNum is not 1 at the end, then it is also prime
		if(factNum != 1)
		{
			factors.add(factNum);
		}
		
		//Sort Factors
		Collections.sort(factors);
	}
	
	//Return list of primes
	public List<Long> getPrimes()
	{
		if(!isSolved)
		{
			solve();
		}
		
		return factors;
	}
}