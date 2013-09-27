/*
	Stephen Rice
	ProjectEuler.net
	September 26, 2013
	
	Problem 4: A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

	Find the largest palindrome made from the product of two 3-digit numbers.
*/

import primality.PrimeFactors;
import primality.Palindrome;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class P4 implements Problem
{
	private List<Integer> palindromes;
	private int upperLimit;
	private int lowerLimit;
	
	public P4(int upLimit, int lowLimit)
	{
		palindromes = new ArrayList<Integer>();
		upperLimit = upLimit;
		lowerLimit = lowLimit;
	}
	
	//Use the Palindromes library class to check if each number is a palindrome
	public void solve()
	{
		//Check each number i against all higher numbers j
		for(int i = lowerLimit; i < upperLimit; i++)
		{
			for(int j = i; j < upperLimit; j++)
			{
				if(Palindrome.isPalindrome(i * j) )
				{
					palindromes.add(i * j);
				}
			}
		}
	}
	
	//Return the largest palindrome as a string
	public String getSolution()
	{
		Collections.sort(palindromes);
		
		String solution = palindromes.get(palindromes.size() - 1).toString();

		return solution;
	}

}