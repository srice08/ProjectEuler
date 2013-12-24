/*
 * Stephen L. Rice
 * ProjectEuler
 * December 24, 2013
 * 
 * Project 8: Find the greatest product of five consecutive digits in the 1000-digit number.
 * 
 * 7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450
 * 
 */

package problems;

public class P8 implements Problem
{
	private int largestProduct;
	private String number;
 
	//Constructor
	public P8(String inNum)
	{
		number = inNum;
		largestProduct = -1;
	}
	
	//Solve: Improved over brute force by saving the four repeating values
	//Possible Improvement: Reduce number of multiplications by 3 and increase number of divisions by 1 (save 2 * 3 * 4 * 5)
	public void solve()
	{
		if(number.length() >= 5)
		{
			//Get the initial values for all five values and set the first product 
			int One, Two, Three, Four, Five, product;
			One = Character.getNumericValue(number.charAt(0));
			Two = Character.getNumericValue(number.charAt(1));
			Three = Character.getNumericValue(number.charAt(2));
			Four = Character.getNumericValue(number.charAt(3));
			Five = Character.getNumericValue(number.charAt(4));
			
			largestProduct = product = One * Two * Three * Four * Five;
	
			//Loop through the string
			for(int i = 1; i < number.length() - 5; i++)
			{
				//Shift all numbers by one, load the new value and create the product
				One = Two;
				Two = Three;
				Three = Four;
				Four = Five;
				Five = Character.getNumericValue(number.charAt(i + 4));
				
				product = One * Two * Three * Four * Five;
				
				//Check if the new product is larger
				if(product > largestProduct)
				{
					largestProduct = product;
				}	
			}
		}
	}
	
	//Solve2: Original brute force algorithm
	public void solveOld()
	{
		if(number.length() >= 5)
		{

			//Loop through every character, multiply the next 5
			for(int i = 0; i < number.length() - 4; i++)
			{
				//Multiply the next five values
				int product = 1;
				for(int j = 0; j < 5; j++)
				{
					product *= Character.getNumericValue(number.charAt(i + j));
				}
	
				//Check if the new product is larger
				if(product > largestProduct)
				{
					largestProduct = product;
				}
			}
		}
	}
	
	//Return string of the solution
	public String getSolution()
	{
		return new String(new Integer(largestProduct).toString());
	}
	
	//Getters
	public int getLargestProduct()
	{
		return largestProduct;
	}
	
	public String getNumber()
	{
		return number;
	}
}
