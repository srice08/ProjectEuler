/*
	Stephen Rice
	ProjectEuler.net
	September 25, 2013
	
	The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143 ?
*/

import primality.SieveOfEratosthenes;
import java.util.List;
import java.util.ArrayList;

class P3
{
	Long factNum = 0L;
	List<Long> factors;
	boolean flagSolved;
	
	public P3(Long inNum)
	{
		factNum = inNum;
		factors = new ArrayList<Long>();
		flagSolved = false;
	}
	
	public void solve()
	{
		//Retrieve all primes under 1000 using the Sieve of Erastosthenes
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
		
		flagSolved = true;
	}
	
	//Return the largest prime
	public Long getMax()
	{
		if(!flagSolved)
		{
			solve();
		}
		
		return factors.get(factors.size() - 1);
	}
	
	
	public static void main(String args[])
	{
		Long number;
		
		//Take other arguments, default to ProjectEuler.net value
		if(args.length == 0)
		{
			number = 600851475143L;
		}
		else
		{
			number = Long.parseLong(args[0]);
		}
		
		//Time and run the program
		Long startTime = System.currentTimeMillis();
		P3 solver = new P3(number);
		Long solution = solver.getMax();
		Long endTime = System.currentTimeMillis();
		
		//Print out the solution and time
		System.out.printf("Largest factor is %d\n",  solution);
		System.out.println("Took " + (endTime - startTime) + " milliseconds");
	}
}