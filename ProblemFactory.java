/*
	Stephen Rice
	ProjectEuler.net
	
	ProblemFactory.java: Static factory for generating problems
*/

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
			default:
				return null;
		}
	}
}