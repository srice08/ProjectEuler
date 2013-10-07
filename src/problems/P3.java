/*
	Stephen Rice
	ProjectEuler.net
	September 25, 2013
	
	Problem 3: The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143 ?
*/

import primality.PrimeFactors;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class P3 implements Problem
{
	List<Long> factors;
	Long number;
	
	public P3(Long inNum)
	{
		number = inNum;
	}
	
	//Use the PrimeFactors library class to retrieve the prime numbers
	public void solve()
	{
		PrimeFactors factorizer = new PrimeFactors(number, false, 0);
		factors = factorizer.getPrimes();
	}
	
	//Return the largest factor as a string
	public String getSolution()
	{
		String solution = factors.get(factors.size() -1).toString();

		return solution;
	}

}