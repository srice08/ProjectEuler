/*
	Stephen Rice
	ProjectEuler.net
	
	ProblemFactory.java: Static factory for generating problems
*/

package problems;

import java.util.List;
import java.util.ArrayList;

public class ProblemFactory
{
	//Create an return an instance of a problem with ProjectEuler numbers as input
	public static Problem getProblem(int probNum)
	{
		switch (probNum)
		{
			case 1:
				return new P1(1000);
			case 2:
				return new P2();
			case 3:
				return new P3(600851475143L);
			case 4:
				return new P4(999, 100);
			case 5:
				return new P5(1, 20);
			case 6:
				return new P6(100);
			case 7:
				return new P7(10001);
			default:
				return null;
		}
	}
	
	//Return the number of solved problems
	public static List<Integer> getAllProblems()
	{
		List<Integer> problems = new ArrayList<Integer>();
		problems.add(new Integer(1));
		problems.add(new Integer(2));
		problems.add(new Integer(3));
		problems.add(new Integer(4));
		problems.add(new Integer(5));
		problems.add(new Integer(6));
		problems.add(new Integer(7));
		
		return problems;
	}
}