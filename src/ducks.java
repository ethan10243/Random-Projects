import java.util.ArrayList;
import java.util.Scanner;

public class ducks
{
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		
		ArrayList<String> answerArr = new ArrayList<String>();
		
		for(int i = 0; i < cases; i++)
		{
			int ducks = in.nextInt();
			int skipped = in.nextInt();
			
			ArrayList<Integer> duckRow = new ArrayList<Integer>();
			
			for(int d = 0; d < ducks; d++)
			{
				duckRow.add(d + 1);
			}
			
			String killOrder = "";
			int target = skipped - 1;
			
			for( ; duckRow.size() > 1; target = (target + skipped - 1) % duckRow.size())
			{
				killOrder += duckRow.get(target) + " ";
				duckRow.remove(target);
			}
			
			answerArr.add(killOrder);
			
			
		}
		
		for(String s : answerArr)
			System.out.println(s);
	}
	
}
