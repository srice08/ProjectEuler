/*
	Stephen Rice
	ProjectEuler.net
	
	Main.java: Sets up ProblemFactory and runs problems and prints solutions
*/

import problems.Problem;
import problems.ProblemFactory;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		Problem problem;
		Boolean runAll = false;
		
		//Get latest problem from ProblemFactory or accept user input
		if(args.length == 0)
		{
			problem = ProblemFactory.getProblem(7);
		}
		else
		{
			if(!args[0].equals("all"))
			{
				problem = ProblemFactory.getProblem(Integer.parseInt(args[0]));
				if(problem == null)
				{
					System.out.println("The requested solution does not exist.");
					System.exit(-1);
				}
			}
			else
			{
				runAll = true;
				problem = null;
			}
		}
		
		if(!runAll)
		{
			//Time how long it takes to solve the problem
			long startTime = System.currentTimeMillis();
			problem.solve();
			long endTime = System.currentTimeMillis();
			
			//Print out the solution
			String solution = problem.getSolution();
			System.out.println("Solution is " + solution);
			System.out.println("Solution was found in " + (endTime - startTime) + " milliseconds");
		}
		else
		{
			List<Integer> allProb = ProblemFactory.getAllProblems();
			
			long startTime = System.currentTimeMillis();
			for(int i = 0; i < allProb.size(); i++)
			{
				problem = ProblemFactory.getProblem(allProb.get(i));
				problem.solve();
				
				String solution = problem.getSolution();
				System.out.println("Solution to problem " + allProb.get(i) + " is " + solution);
			}
			
			long endTime = System.currentTimeMillis();
			System.out.println("All solutions were found in " + (endTime - startTime) + " milliseconds");
			
		}
	}
	
}