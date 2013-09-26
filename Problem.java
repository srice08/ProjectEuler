/*
	Stephen Rice
	ProjectEuler.net
	September 23, 2013
	
	Problem.java: Provides interface for all Euler problems
*/

public interface Problem
{
	//Solve the problem
	public void solve();
	
	//Return the solution as a string
	public String getSolution();
}