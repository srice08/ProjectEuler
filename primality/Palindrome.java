/*
	Stephen Rice
	ProjectEuler
	September 26, 2013
	
	Palindrome.java: Function to determine if a number is a palinndrome
*/

package primality;

import java.util.ArrayList;

public class Palindrome
{
	
	public static boolean isPalindrome(long number)
	{
		ArrayList<Integer> digits = new ArrayList<Integer>();
		
		//Add each digit into an array list 
		while(number > 0)
		{
			digits.add( new Long(number % 10).intValue() );
			number = number/10;
		}
		
		//Check if each digit and its complement ( (0, n), (1, n - 1), ...) is the same
		for(int i = 0; i < digits.size() / 2 + 1; i++)
		{
			if (digits.get(i) != digits.get(digits.size() - i - 1))
			{
				return false;
			} 
		}
		
		return true;
	}
}