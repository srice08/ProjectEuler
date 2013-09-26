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

class P3 implements Problem
{
	List<Long> factors;
	PrimeFactors primes;
	
	public P3(Long inNum)
	{
		primes = new PrimeFactors(inNum);
	}
	
	//Use the PrimeFactors library class to retrieve the prime numbers
	public void solve()
	{
		factors = primes.getPrimes();
	}
	
	//Return the largest factor as a string
	public String getSolution()
	{
		String solution = factors.get(factors.size() -1).toString();

		return solution;
	}

}