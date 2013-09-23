/*
	Stephen Rice
	ProjectEuler.net
	September 23, 2013
	
	Problem 1: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6, and 9. 
	The sume of these multiples is 23.
	Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class P1
{
	int maxVal;
	int sum;
	
	public P1(int val)
	{
		maxVal = val;
		sum = 0;
	}
	
	public int solve()
	{
		for(int i = 3; i < maxVal; i++)
		{
			if(i % 3 == 0 || i % 5 == 0)
			{
				sum += i;
			}
		}
		

		return sum;
	
	}
	
	
	public static void main(String[] args)
	{
		int maxVal;
		
		if(args.length == 0)
		{
			maxVal = 1000;
		}
		else
		{
			maxVal = Integer.parseInt(args[0]);
		}
		
		long startTime = System.currentTimeMillis();
		P1 solver = new P1(maxVal);
		int solution = solver.solve();
		long endTime = System.currentTimeMillis();
		
		System.out.println("Sum is " + solution);
		System.out.println("Took " + (endTime - startTime) + " milliseconds");
	}
	
}