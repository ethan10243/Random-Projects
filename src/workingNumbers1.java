import java.util.ArrayList;

public class workingNumbers1
{

	/**
	 * main tester
	 * @param args – tester arguments (<i>not used</i>)
	 */
	public static void main(String[] args)
	{
//		String testFraction1 = "4/5";
//		String testFraction2 = "12 / 45";
//		System.out.println(workingNumbers1.toTextFraction(testFraction1));
//		System.out.println(workingNumbers1.toTextFraction(testFraction2));
//	
//		System.out.println(workingNumbers1.getNumerator(testFraction1));
//		System.out.println(workingNumbers1.getDenominator(testFraction1));
//	
//		System.out.println(workingNumbers1.getNumerator(testFraction2));
//		System.out.println(workingNumbers1.getDenominator(testFraction2));
//		
//		System.out.println("410 = " + workingNumbers1.number2Text(410));
//		System.out.println("-311 089 = " + workingNumbers1.number2Text(-311089));
//		System.out.println("0 = " + workingNumbers1.number2Text(0));
//		System.out.println("-0 = " + workingNumbers1.number2Text(-0));
//		System.out.println("4 700 800 = " + workingNumbers1.number2Text(4700800));
//		System.out.println("999 999 999 = " + workingNumbers1.number2Text(999999999));
		
		System.out.println("1 = " + workingNumbers1.number2Text(1));
		System.out.println("2 = " + workingNumbers1.number2Text(2));
		System.out.println("3 = " + workingNumbers1.number2Text(3));
		System.out.println("4 = " + workingNumbers1.number2Text(4));
		System.out.println("5 = " + workingNumbers1.number2Text(5));
		System.out.println("6 = " + workingNumbers1.number2Text(6));
		System.out.println("7 = " + workingNumbers1.number2Text(7));
		System.out.println("8 = " + workingNumbers1.number2Text(8));
		System.out.println("9 = " + workingNumbers1.number2Text(9));
		System.out.println("10 = " + workingNumbers1.number2Text(10));
		System.out.println("11 = " + workingNumbers1.number2Text(11));
		System.out.println("12 = " + workingNumbers1.number2Text(12));
		System.out.println("13 = " + workingNumbers1.number2Text(13));
		System.out.println("14 = " + workingNumbers1.number2Text(14));
		System.out.println("15 = " + workingNumbers1.number2Text(15));
		System.out.println("16 = " + workingNumbers1.number2Text(16));
		System.out.println("17 = " + workingNumbers1.number2Text(17));
		System.out.println("550 690 = " + workingNumbers1.number2Text(550690));
		System.out.println("310 480 = " + workingNumbers1.number2Text(310480));
		System.out.println("20 = " + workingNumbers1.number2Text(20));
	}
	
	/**
	* Basic constructor outline.
	* </br>
	*
	*/
	public workingNumbers1()
	{
		System.out.println("Math Machine Created.");
	}
	
	/**
	* Gives the sum of 2 given numbers. </br>
	*
	* @param num1 – the first number to add
	* @param num2 – the second number to add
	* @return The sum of <code>num1</code> and <code>num2</code>
	*/
	public static int createSum(int num1, int num2)
	{
		return (num1 + num2);
	}
	
	/**
	*
	*
	*
	*/
	public static double createSum(double num1, double num2)
	{
		return (num1 + num2);
	}
	
	/**
	* Converts a given fraction in 'number form' to 'text form.'</br>
	* Correct input format example: "4/5" or "4 / 5" </br>
	*</br>
	* Precondition: Format of input fraction must match above.</br>
	* Precondition: Input string must be at least 3 characters long.
	* 
	* @param numFraction – given number in int form
	* @return the given <code>numFraction</code> in String form
	*/
	public static String toTextFraction(String numFraction)
	{
		numFraction = numFraction.trim();
		if(numFraction.length() < 3)
			return ("ERROR: Input is too short. "
				+ "Please modify your fraction have a numerator that is at least one digit, a denominator that is at least one digit, and a divisor symbol.");
		//boolean spaced = false;
		int numerator, denominator;
		int splitPoint = numFraction.indexOf("/");
		if(splitPoint < 0)
			{
				splitPoint = numFraction.indexOf(" / ");
				//spaced = true;
			}
		if(splitPoint < 0)
			return ("ERROR: Unable to convert given fraction. Please check that it was entered correctly.");
		numerator = Integer.parseInt(numFraction.substring(0, splitPoint).trim());
		//if(spaced)
		denominator = Integer.parseInt(numFraction.substring(splitPoint + 1).trim());
	
		String full = workingNumbers1.number2Text(numerator) + "over " + workingNumbers1.number2Text(denominator);
		return full;
	}
	
	/**
	* Returns the numerator of the given fraction.
	* Correct input format example: "4/5", "4 / 5", "32 / 7", or "500/45" </br>
	* </br>
	* Precondition: Format of input fraction must match above. </br>
	* Precondition: Input string must be at least 3 characters long.
	*/
	public static String getNumerator(String numFraction)
	{
		numFraction = numFraction.trim();
		if(numFraction.length() < 3)
			return ("ERROR: Input is too short. "
				+ "Please modify your fraction have a numerator that is at least one digit, a denominator that is at least one digit, and a divisor symbol.");
		//boolean spaced = false;
		String numerator;
		int splitPoint = numFraction.indexOf("/");
		if(splitPoint < 0)
			{
				splitPoint = numFraction.indexOf(" / ");
				//spaced = true;
			}
		if(splitPoint < 0)
			return ("ERROR: Unable to find the numerator in the given fraction. Please check that it was entered correctly.");
		numerator = numFraction.substring(0, splitPoint).trim();
	
		return numerator;
	}
	
	/**
	* Returns the denominator of the given fraction. </br>
	* Correct input format example: "4/5", "4 / 5", "32 / 7", or "500/45" </br>
	*</br>
	* Precondition: Format of input fraction must match above. </br>
	* Precondition: Input string must be at least 3 characters long. </br>
	* Precondition: Both the numerator and denominator must be within range to be integers.
	* 
	* @param numFraction – The fraction as a String of numbers
	* 
	* @return The fraction in sentence / word form
	*/
	public static String getDenominator(String numFraction)
	{
		numFraction = numFraction.trim();
		if(numFraction.length() < 3)
			return ("ERROR: Input is too short. "
				+ "Please modify your fraction have a numerator that is at least one digit, a denominator that is at least one digit, and a divisor symbol.");
		//boolean spaced = false;
		String denominator;
		int splitPoint = numFraction.indexOf("/");
		if(splitPoint < 0)
			{
				splitPoint = numFraction.indexOf(" / ");
				//spaced = true;
			}
		if(splitPoint < 0)
			return ("ERROR: Unable to find the numerator in the given fraction. Please check that it was entered correctly.");
		denominator = numFraction.substring(splitPoint + 1).trim();
	
		return denominator;
	}
	
	/**
	 * Converts a given int number to a String describing the number's value </br>
	 * </br>
	 * Precondition: Given number must be smaller than 1 000 000 000 000 000 000 . 000 ( = 1 quintillion)
	 * 
	 * @param number – the number as an int
	 * @return the inputed number in text form.
	 */
	public static String number2Text(int number)
	{
		//Setup
		String text = "ERROR: Number connot be converted. Please make sure it is enetred correctly.";
		boolean positive = true;
		String preString = Integer.toString(number);
		ArrayList<Integer> digits = new ArrayList<Integer>();
		
		//Check for negative
		if(preString.substring(0, 1).equals("-"))
		{
			preString = preString.substring(1);
			if(digits.size() == 1 && digits.get(0) == 0); //Check if number is Zero (-0 = 0)
			else
				positive = false;
		}
		
		//Fill ArrayList with each individual digit
		//First digit > first slot, last digit > last slot 
		for(int i = preString.length() - 1; i >= 0; i--)
		{
			digits.add(Integer.parseInt(preString.substring(i, i + 1)));
		}
		
		//Begin creating number String...
		
		//Track last digit (for teens glitch)
		int nextDigit = 0;
		
		//Negative number?
		if(!positive) text = "negative ";
		else text = "";
		
		//Create number description String (one digit at a time, technically backwards)
		for(int index = digits.size() - 1; index >= 0; index--)
		{
			//Update next digit
			if(index < digits.size() - 1)nextDigit = digits.get(index + 1);
			
			//Only Zero catch
			if(digits.size() == 1)
			{
				text += placeConverter(quickConvert(digits.get(index)), "o", nextDigit);
			}
			//Ones places
			else if((index == 0 || index == 3 || index == 6 || index == 9 || index == 12 || index == 15) && (digits.get(index) != 0))
			{
				text += placeConverter(quickConvert(digits.get(index)), "o", nextDigit);
			}
			//Tens places
			else if((index == 1 || index == 4 || index == 7 || index == 10 || index == 13 || index == 16))        //&& (digits.get(index) != 0)
			{
				text += placeConverter(quickConvert(digits.get(index)), "t", nextDigit);
			}
			//Hundreds places
			else if((index == 2 || index == 5 || index == 8 || index == 11 || index == 14 || index == 17) && (digits.get(index) != 0))
			{
				text += placeConverter(quickConvert(digits.get(index)), "h", nextDigit);
			}
			
			//Extra additions
			if(index == 3) text += " thousand ";
			if(index == 6) text += " million ";
			//if(c == 10) text += "billion ";
			//if(c == 13) text += "trillion ";
			//if(c == 13) text += "quadrillion ";
			
		}
		//Return final String
		return (text.trim());
	}
	
	/**
	 * Takes in int, outputs String description of its value
	 * @param number – given number is int form
	 * @return given number in String form
	 */
	public static String quickConvert(int number)
	{
		if(number == 1) return "one";
		if(number == 2) return "two";
		if(number == 3) return "three";
		if(number == 4) return "four";
		if(number == 5) return "five";
		if(number == 6) return "six";
		if(number == 7) return "seven";
		if(number == 8) return "eight";
		if(number == 9) return "nine";
		return "zero";
	}
	
	/**
	 * Takes in String, outputs int of its value
	 * @param numberString – given number in String form
	 * @return given number in int form
	 */
	public static int quickConvert(String numberString)
	{
		if(numberString == "one") return 1;
		if(numberString == "two") return 2;
		if(numberString == "three") return 3;
		if(numberString == "four") return 4;
		if(numberString == "five") return 5;
		if(numberString == "six") return 6;
		if(numberString == "seven") return 7;
		if(numberString == "eight") return 8;
		if(numberString == "nine") return 9;
		return (0);
	}
	
	/**
	 * Takes in digit and place, uses assignment to transform it "in context." </br>
	 * <b>Ex:</b> a 3 in the tens place is thirty (30)
	 * 
	 * @param numberString – the number to convert
	 * @param place – the place the digit is in (see below) </br>
	 * <i>o = ones, t = tens, h = hundreds</i>
	 * @param next – the next digit in the int ArrayList
	 * 
	 * @return the converted digit in context
	 */
	public static String placeConverter(String numberString, String place, int next)
	{
		String text = numberString;
		
		if(place.equals("o"))
		{
			text = numberString;
		}
		else if(place.equals("t"))
		{
			if(workingNumbers1.quickConvert(numberString.trim()) == 1) 
			{
				if(next == 0) text = "ten";
				else if(next == 1) text = "eleven";
				else if(next == 2) text = "twelve";
				else
				{
					if(next ==  3) text = "thir";
					else if(next ==  5) text = "fif";
					else if(next ==  8) text = "eigh";
					text += "teen ";
				}
			}
			if(workingNumbers1.quickConvert(numberString.trim()) == 2) text = "twenty ";
			else if(workingNumbers1.quickConvert(numberString.trim()) == 3) text = "thirty ";
			else if(workingNumbers1.quickConvert(numberString.trim()) == 8) text += "y ";
			else if(workingNumbers1.quickConvert(numberString.trim()) > 1) text += "ty ";
			//else if(next != 0) text = "";
			else text = "";  //empty string
		}
		else if(place.equals("h"))
		{
			text += " hundred ";
		}
		
		return text;
	}

}

//Created by Ethan Bütt. May 2017.