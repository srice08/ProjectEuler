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

public class PrimeFactors
{
	public static List<Long> getPrimes(Long inNum)
	{
		Long factNum = 0L;
		factNum = inNum;
		List<Long> factors = new ArrayList<Long>();
		
		SieveOfEratosthenes sieve = new SieveOfEratosthenes(1000);
		ArrayList<Long> startingPrimes = (ArrayList<Long>) sieve.getPrimes();
		
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
}