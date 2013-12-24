/*
	Stephen Rice
	ProjectEuler
	September 26, 2013
	
	Palindrome.java: Function to determine if a number is a palinndrome
*/

package primality;


public class Palindrome
{
	
	public static boolean isPalindrome(long number)
	{
		//Ensure the number is positive
		number = Math.abs(number);
		
		long origNum = number;
		long revNum = 0;
		
		//Use modular arithmetic to reverse the original number
		while(number > 0)
		{
			revNum = revNum * 10 +  number % 10;
			number = number/10;
		}
		
		return (revNum == origNum);

	}
}