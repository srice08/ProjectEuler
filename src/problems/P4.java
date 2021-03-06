/*
	Stephen Rice
	ProjectEuler.net
	September 26, 2013
	
	Problem 4: A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

	Find the largest palindrome made from the product of two 3-digit numbers.
*/

package problems;

import primality.Palindrome;

public class P4 implements Problem
{
	private long maxPal;
	private long factorOne;
	private long factorTwo;
	
	private int upperLimit;
	private int lowerLimit;
	
	public P4(int upLimit, int lowLimit)
	{
		upperLimit = upLimit;
		lowerLimit = lowLimit;
		maxPal = 0;
	}
	
	//Use the Palindromes library class to check if each number is a palindrome
	public void solve()
	{
		//Check each number i against all higher numbers j
		for(int i = lowerLimit; i < upperLimit; i++)
		{
			for(int j = i; j < upperLimit; j++)
			{
				if(i * j > maxPal && Palindrome.isPalindrome(i * j) )
				{
					maxPal = i * j;
					factorOne = i;
					factorTwo = j;
				}
			}
		}
	}
	
	//Return the largest palindrome as a string
	public String getSolution()
	{	
		String solution = new Long(maxPal).toString() + ", factors:  " + factorOne + " & " + factorTwo;

		return solution;
	}

	public long getFactorOne()
	{
		return factorOne;
	}
	
	public long getFactorTwo()
	{
		return factorTwo;
	}

	public long getPalindrome()
	{
		return maxPal;
	}

}