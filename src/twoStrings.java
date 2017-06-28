import java.util.ArrayList;
import java.util.Scanner;

public class twoStrings
{
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Test Cases: ");
		int until = in.nextInt();
		
		@SuppressWarnings("unused")
		String scrap = in.nextLine();
		
		ArrayList<String> answer = new ArrayList<String>();
		
		for(int i = 0; i < until; i++)
		{
			System.out.print("First String: ");
		    String first = in.nextLine();
		    System.out.print("Second String: ");
		    String second = in.nextLine();
		    answer.add(largestCommonSubstring(first, second));
		}
		
		for(String s : answer) System.out.println(s.trim());
		
	}
	
	public static String largestCommonSubstring(String str1, String str2)
	{
		String common = "";
		int length;
		String shorter;
		String longer;
		if(str1.length() > str2.length()) { length = str2.length(); shorter = str2; longer = str1; }
		else { length = str1.length(); shorter = str1; longer = str2; }
		
		ArrayList<String> matches = new ArrayList<String>();
		ArrayList<String> otherMatches = new ArrayList<String>();
		ArrayList<String> matchingIndexes = new ArrayList<String>();
		
		for(int i = 0; i < length; i++)
		{
			int thisChar = i;
			if(longer.indexOf(shorter.charAt(thisChar)) >= 0)
			{
				int matchingChar = longer.indexOf(shorter.charAt(thisChar));
				boolean keepGoing = true;
				String match = Character.toString(shorter.charAt(thisChar));
				String match2 = Character.toString(shorter.charAt(matchingChar));
				String matchI = "<" + thisChar + " " + matchingChar;
				while(keepGoing)
				{
					thisChar++;
					matchingChar++;
					try
					{
						if(longer.indexOf(shorter.charAt(thisChar)) >= 0) { match += Character.toString(shorter.charAt(thisChar)); match2 += Character.toString(longer.charAt(matchingChar)); matchI += ", " + thisChar + " " + matchingChar; }
						else { keepGoing = false; matchI += ">"; }
					}
					catch(IndexOutOfBoundsException e)
					{
						keepGoing = false; matchI += ">";
					}
				}
				matchingIndexes.add(matchI);
				matches.add(match);
				otherMatches.add(match2);
				matches.add("||");
				otherMatches.add("||");
			}
		}
		
		for(int cc = 0; cc < matches.size(); cc++)
		{
			if(!matches.get(cc).equals(otherMatches.get(cc)))
			{
				matches.remove(cc);
				otherMatches.remove(cc);
				cc--;
			}
		}
		
		String champ;
		
		if(matches.isEmpty()) champ = "";
		else
		{
			champ = matches.get(0);
			
			for(String s : matches)
			{
				if(s.length() > champ.length())
					if(!s.equals("||"))
						champ = s;
			}
		}
		common = champ;
		
		return common;
	}
}

//if(longer.indexOf(shorter.charAt(thisChar)) >= 0) { match += Character.toString(shorter.charAt(thisChar)); match2 += Character.toString(longer.charAt(matchingChar)); matchI += ", " + thisChar + " " + matchingChar; }
//if(shorter.substring(thisChar, thisChar + 1).equals(longer.substring(matchingChar, matchingChar + 1))) { match += (shorter.substring(thisChar, thisChar + 1)); matchI += ", " + thisChar + " " + matchingChar; }