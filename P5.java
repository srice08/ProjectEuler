/*
	Stephen Rice
	ProjectEuler.net
	September 27, 2013
	
	Problem 5: 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

import primality.PrimeFactors;

import java.util.List;

class P5 implements Problem
{
	private int upperLimit;
	private int lowerLimit;
	
	private long smallestNum;
	
	public P5(int lowLimit, int upLimit)
	{
		upperLimit = upLimit;
		lowerLimit = lowLimit;
		smallestNum = Long.MAX_VALUE;
		
	}
	
	//Brute Force Solve
	public void solve()
	{
		boolean numFound = false;
		long currentNum = upperLimit;
		
		while(!numFound)
		{
			int numMatches = 0;
			
			//Check if the number is divisible by all values
			for(int i = lowerLimit; i <= upperLimit; i++)
			{
				if(currentNum % i == 0)
				{
					numMatches++;
				}
			}
			
			//If it does, then you've found the smallest
			if (numMatches == upperLimit - lowerLimit + 1)
			{
				smallestNum = currentNum;
				numFound = true;
			}
			
			currentNum++;
		}
	}
	
	//Return the largest palindrome as a string
	public String getSolution()
	{	
		String solution = new Long(smallestNum).toString();

		return solution;
	}

}