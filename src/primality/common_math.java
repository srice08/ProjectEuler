/*
	Stephen Rice
	common_math.java
	
	Written September 26th, 2013
	
	Return the Prime Factors for a number
*/

package primality;

public class common_math
{
	
	//Basic Euclidean algorithm function
	public static long euc(long u, long v)
	{
		if(v == 0)
		{
			return u;
		}
		else 
		{
			return euc(v, u % v);
		}
	}
	
	
	//Basic Least-Common-Multiple solution using EUC
	public static long lcm(long u, long v)
	{
		long val = euc(u,v);
		
		if(val == 0)
		{
			return 0;
		}
		
		return u * v / euc(u, v);
	}
}