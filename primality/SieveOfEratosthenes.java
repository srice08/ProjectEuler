/*
	Stephen Rice
	SieveOfEratosthenes.java
	
	Written September 25th, 2013, Modified October 4, 2013
	
	Utilize the algorithm laid out in the Sieve of Eratosthenes to find the primes under a given value

	Possible optimization: Use singleton to access sieve potentially?
*/

package primality;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes
{
	private long upperLimit;
	private List<Long> primes;
	private Boolean flagSolved;
	
	//Static method to return primes up to a given limit
	public static List<Long> getPrimes(long limit)
	{
		List<Long> primes = new ArrayList<Long>();
		
		List<Boolean> sieve = new ArrayList<Boolean>();

		//Set-up initial sieve values (dividing by 2 to represent evens)
		for(int i = 0; i < limit/2; i++)
		{
			sieve.add(true);
		}

		//Perform sieve operation
		for(int i = 0; i < limit/2; i++)
		{
			if(sieve.get(i) == true)
			{
				//All values will take the form 2k + 3, add i to the initial value to ensure selection
				for(int j = (2 * i) + 3 + i; j < limit/2; j += (2 * i) + 3)
				{
					sieve.set(j, false);
				}
			}
		}

		//Add found primes to list of primes
		for(int i = 0; i < limit/2; i++)
		{
			if (sieve.get(i))
			{
				primes.add(Long.valueOf((2 * i) + 3));
			}
		}
		primes.add(0, Long.valueOf(2));
		return primes;
	}
	
	public SieveOfEratosthenes(long limit)
	{
		primes = new ArrayList<Long>();
		upperLimit = limit/2;
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
				primes.add(Long.valueOf((2 * i) + 3));
			}
		}
		
		//Add 2 to the front
		primes.add(0, Long.valueOf(2));
		
		
		flagSolved = true;
	}
	
	//Given a value, mark all multiples as not prime
	private void solveValue(int startVal, List<Boolean> sieve)
	{
		//Only looks at odds that take the form of 2k + 3; have to add i to ensure proper initial selection
		for(int i = (2 * startVal) + 3 + startVal; i < upperLimit; i += (2 * startVal) + 3)
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