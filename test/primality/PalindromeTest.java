package test.primality;

import static org.junit.Assert.*;

import org.junit.Test;

import primality.Palindrome;

public class PalindromeTest
{

	@Test
	public void testIsPalindrome()
	{
		//Test 0
		org.junit.Assert.assertEquals(true, primality.Palindrome.isPalindrome(000));
		
		//Test basic palindrome
		org.junit.Assert.assertEquals(true, primality.Palindrome.isPalindrome(121));
		
		//Test basic palindrome that is even
		org.junit.Assert.assertEquals(true, primality.Palindrome.isPalindrome(5885));
		
		//Test non palindrome
		org.junit.Assert.assertEquals(false, primality.Palindrome.isPalindrome(122));
		
		//Test non palindrome that is even
		org.junit.Assert.assertEquals(false, primality.Palindrome.isPalindrome(5655));
	
		//Test negative number
		org.junit.Assert.assertEquals(true, primality.Palindrome.isPalindrome(-12321));
		
		//Test negative number that is even
		org.junit.Assert.assertEquals(true, primality.Palindrome.isPalindrome(-987789));
		
		//Test negative number that is not a palindrome
		org.junit.Assert.assertEquals(false, primality.Palindrome.isPalindrome(-4272));
	
		//Test negative odd number that is not a palindrome
		org.junit.Assert.assertEquals(false, primality.Palindrome.isPalindrome(-42725));
	}
}
