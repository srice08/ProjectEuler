/*
	Stephen Rice
	ProjectEuler.net
	September 23, 2013
	
	Problem 1: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6, and 9. 
	The sume of these multiples is 23.
	Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class P1 implements Problem
{
	int maxVal;
	int sum;
	
	public P1(int val)
	{
		maxVal = val;
		sum = 0;
	}

	//Sum = Sum(MaxVal/3) + Sum(MaxVal/5) - Sum(MaxVal/15) by Inclusion/Exclusion	
	public void solve()
	{
		//Subtract 1 from MaxVal to represent strictly less than MaxVal
		maxVal--;
		
		//Find the number of multiples of each type
		int numThrees = maxVal/3;
		int numFives = maxVal/5;
		int numFifteens = maxVal/15;
		
		//Find the sums of each individual multiple
		int sumThrees = 3 *( numThrees * (numThrees + 1)/ 2);
		int sumFives = 5 *( numFives * (numFives + 1)/ 2);
		int sumFifteens = 15 *( numFifteens * (numFifteens + 1)/ 2);
		
		//Find final sum
		sum = sumThrees + sumFives - sumFifteens;
	}
	
	//Return the solution as a string
	public String getSolution()
	{
		String solution = Integer.toString(sum);
		return solution;
	}
}