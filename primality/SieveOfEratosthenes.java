/*
	Stephen Rice
	SieveOfEratosthenes.java
	
	Written September 25th, 2013
	
	Utilize the algorithm laid out in the Sieve of Eratosthenes to find the primes under a given value
*/

package primality;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes
{
	private long upperLimit;
	private List<Long> primes;
	private Boolean flagSolved;
	
	public SieveOfEratosthenes(long limit)
	{
		primes = new ArrayList<Long>();
		upperLimit = limit;
		flagSolved = false;
	}
	
	//Find all primes under UpperLimit via SieveOfErathosthenes
	private void solve()
	{
		List<Boolean> sieve = new ArrayList<Boolean>();;
		
		//Set-up initial sieve values
		for(int i = 0; i < upperLimit; i++)
		{
			sieve.add(true);
		}
		
		sieve.set(0, false);
		sieve.set(1, false);
		
		//Perform sieve operation
		for(int i = 0; i < upperLimit; i++)
		{
			if(sieve.get(i) == true)
			{
				solveValue(i, sieve);
				
			}
		}
		
		//Add found primes to list of primes
		for(int i = 0; i < upperLimit; i++)
		{
			if (sieve.get(i))
			{
				primes.add(Long.valueOf(i));
			}
		}
		
		flagSolved = true;
	}
	
	//Given a value, mark all multiples as not prime
	private void solveValue(int startVal, List<Boolean> sieve)
	{
		for(int i = startVal * 2; i < upperLimit; i+=startVal)
		{
			sieve.set(i, false);
		}
	}
	
	//Solve if not solved, return list of primes
	public List<Long> getPrimes()
	{
		if(!flagSolved)
		{
			solve();
		}
		
		return primes;
	}
	
}