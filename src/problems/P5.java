/*
	Stephen Rice
	ProjectEuler.net
	September 27, 2013
	
	Problem 5: 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

package problems;

import primality.common_math;

public class P5 implements Problem
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
	
	//Use LCM function to find the LCM of all values
	public void solve()
	{
		smallestNum = 1;
		for(int i = lowerLimit; i <= upperLimit; i++)
		{
			smallestNum = common_math.lcm(smallestNum, i);
		}
	}
	
	//Return the smallest multiple as a string
	public String getSolution()
	{	
		String solution = new Long(smallestNum).toString();

		return solution;
	}
	
	//Getters
	public long getSmallestNum()
	{
		return smallestNum;
	}

}