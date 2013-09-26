/*
	Stephen Rice
	ProjectEuler.net
	September 25, 2013
	
	The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143 ?
*/

import primality.PrimeFactors;

import java.util.List;
import java.util.ArrayList;

class P3
{
	List<Long> factors;
	boolean flagSolved;
	PrimeFactors primes;
	
	public P3(Long inNum)
	{
		primes = new PrimeFactors(inNum);
	}
	
	//Return the largest prime
	public Long getMax()
	{
		if(!flagSolved)
		{
			factors = primes.getPrimes();
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