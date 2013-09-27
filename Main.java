/*
	Stephen Rice
	ProjectEuler.net
	
	Main.java: Sets up ProblemFactory and runs problems and prints solutions
*/

public class Main
{
	public static void main(String[] args)
	{
		Problem problem;
		
		//Get latest problem from ProblemFactory or accept user input
		if(args.length == 0)
		{
			problem = ProblemFactory.getProblem(6);
		}
		else
		{
			problem = ProblemFactory.getProblem(Integer.parseInt(args[0]));
			if(problem == null)
			{
				System.out.println("The requested solution does not exist.");
				System.exit(-1);
			}
		}
		
		//Time how long it takes to solve the problem
		long startTime = System.currentTimeMillis();
		problem.solve();
		long endTime = System.currentTimeMillis();
		
		//Print out the solution
		String solution = problem.getSolution();
		System.out.println("Solution is " + solution);
		System.out.println("Solution was found in " + (endTime - startTime) + " milliseconds");
	}
	
}