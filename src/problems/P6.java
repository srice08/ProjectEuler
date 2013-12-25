/*
	Stephen Rice
	ProjectEuler.net
	September 27, 2013
	
	Problem 6: The sum of the squares of the first ten natural numbers is,

	1^2 + 2^2 + ... + 10^2 = 385
	The square of the sum of the first ten natural numbers is,

	(1 + 2 + ... + 10)^2 = 552 = 3025
	Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

	Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

package problems;

public class P6 implements Problem
{
	private long limit;
	private long answer;
	
	//Take in the limit for natural numbers
	public P6(int inLimit)
	{
		limit = inLimit;
		answer = 0;
	}
	
	//Calculate square of sums and sum of squares, then take the difference
	public void solve()
	{
		long sumSquares = 0;
		long squareSums = 0;
		
		for(int i = 1; i <= limit; i++)
		{
			sumSquares += i*i;
			squareSums += i;
		}
		
		squareSums = squareSums * squareSums;
		
		answer = squareSums - sumSquares;
		
	}
	
	//Convert answer to string for printing
	public String getSolution()
	{	
		String solution = new Long(answer).toString();

		return solution;
	}
	
	//Getters
	public long getAnswer()
	{
		return answer;
	}

}