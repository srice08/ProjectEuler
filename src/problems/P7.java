/*
	Stephen Rice
	ProjectEuler.net
	October 2, 2013
	
	Problem 7: By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

	What is the 10 001st prime number?*/

import primality.PrimeFactors;

class P7 implements Problem
{
	private long limit;
	private long answer;
	private long numPrimes;
	
	//Take in the upper limit (the prime you want to find)
	public P7(int inLimit)
	{
		limit = inLimit;
		answer = 0;
		numPrimes = 1;
	}
	
	//Find the last prime
	public void solve()
	{
		//Check every other number from 3 to limit and check its prime factors to see if it is prime
		long lastPrime = 0;
		long i = 3;
		while(numPrimes < limit)
		{		
			if(PrimeFactors.getPrimes(i).size() <= 1)
			{
				numPrimes++;
				lastPrime = i;
			}
			
			i+=2;
		}
		
		answer = lastPrime;
	}
	
	//Convert answer to string for printing
	public String getSolution()
	{	
		String solution = new Long(answer).toString();

		return solution;
	}

}