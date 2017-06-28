
public class numberConverter2
{
	public static void main(String[] args)
	{
//		System.out.println("Converting 0 to: " + numberConverter2.convertIt(0));
//		System.out.println("Converting 1 to: " + numberConverter2.convertIt(1));
//		System.out.println("Converting 2 to: " + numberConverter2.convertIt(2));
//		System.out.println("Converting 3 to: " + numberConverter2.convertIt(3));
//		System.out.println("Converting 5 to: " + numberConverter2.convertIt(5));
//		System.out.println("Converting 10 to: " + numberConverter2.convertIt(10));
//		System.out.println("Converting 11 to: " + numberConverter2.convertIt(11));
//		System.out.println("Converting 12 to: " + numberConverter2.convertIt(12));
//		System.out.println("Converting 13 to: " + numberConverter2.convertIt(13));
//		System.out.println("Converting -14 to: " + numberConverter2.convertIt(-14));
//		System.out.println("Converting 20 to: " + numberConverter2.convertIt(20));
//		System.out.println("Converting 21 to: " + numberConverter2.convertIt(21));
//		System.out.println("Converting 30 to: " + numberConverter2.convertIt(30));
//		System.out.println("Converting 80 to: " + numberConverter2.convertIt(80));
//		System.out.println("Converting -74 to: " + numberConverter2.convertIt(-74));
//		System.out.println("Converting 100 to: " + numberConverter2.convertIt(100));
		
		System.out.println("Converting 0 to: " + numberConverter2.go(0));
		System.out.println("Converting 1 to: " + numberConverter2.go(1));
		System.out.println("Converting 2 to: " + numberConverter2.go(2));
		System.out.println("Converting 3 to: " + numberConverter2.go(3));
		System.out.println("Converting 5 to: " + numberConverter2.go(5));
		System.out.println("Converting 10 to: " + numberConverter2.go(10));
		
		System.out.println("Converting 'zero' to: " + numberConverter2.go("zero"));
		System.out.println("Converting 'one' to: " + numberConverter2.go("one"));
		System.out.println("Converting 'two' to: " + numberConverter2.go("two"));
		System.out.println("Converting 'three' to: " + numberConverter2.go("three"));
		System.out.println("Converting 'five' to: " + numberConverter2.go("five"));
		System.out.println("Converting 'ten' to: " + numberConverter2.go("ten"));
	}
	
	public static String convertIt(int givenNumber)
	{
		String textForm = "";
		
		return textForm;
	}
	
	/**
	 * Converts simple text form of single digit integer to an int.
	 * 
	 * @param from – String representation of desired int output.
	 * PRE: Given String <code>from</code> represents a number between 0 and 9.
	 * 
	 * @return to – produced number in simple text form.
	 */
	public static int go(String from)
	{
		if(from.equalsIgnoreCase("zero")) return 0;
		else if(from.equalsIgnoreCase("one")) return 1;
		else if(from.equalsIgnoreCase("two")) return 2;
		else if(from.equalsIgnoreCase("three")) return 3;
		else if(from.equalsIgnoreCase("four")) return 4;
		else if(from.equalsIgnoreCase("five")) return 5;
		else if(from.equalsIgnoreCase("six")) return 6;
		else if(from.equalsIgnoreCase("seven")) return 7;
		else if(from.equalsIgnoreCase("eight")) return 8;
		else if(from.equalsIgnoreCase("nine")) return 9;
		else { System.err.println("INVALID INPUT: '" + from + "'. Supplied String is not entered in the correct format, or is out of the correct range."); return 0; }
	}
	
	/**
	 * Converts single digit integer to simple text form.
	 * 
	 * @param from – given number to be converted to simple text.
	 * PRE: Given int <code>from</code> is between 0 and 9.
	 * 
	 * @return to – produced String representation of the given int.
	 */
	public static String go(int from)
	{
		if(from < 0 || from > 9) { System.err.println("INVALID INPUT: " + from + ". Supplied int is not within the correct range, or is entered incorrectly."); return null; }
		else if(from == 0) return "zero";
		else if(from == 1) return "one";
		else if(from == 2) return "two";
		else if(from == 3) return "three";
		else if(from == 4) return "four";
		else if(from == 5) return "five";
		else if(from == 6) return "six";
		else if(from == 7) return "seven";
		else if(from == 8) return "eight";
		else if(from == 9) return "nine";
		else { System.err.println("<< Unregistered Converstion Error in METHOD(public String go(int from)). >>"); return null; }
	}
}

//