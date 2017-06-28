import java.util.Scanner;

public class negSum
{
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int until = in.nextInt();
		int[] integers = new int[until];
		for(int i = 0; i < until; i++)
		{
		    integers[i] = in.nextInt();
		}
		//System.out.println(toString(integers));
		int sum = 0;
		for(int i = 0; i < until; i++)
		{
		    if(integers[i] > 0) sum += integers[i];
		}
		System.out.println("Sum of non-negative numbers: " + sum);
	}
	
	public static String toString(int[] arr)
	{
		String profile = "Array Contents: [ ";
		for(int i : arr)
		{
			profile += i + " ";
		}
		profile += "]";
		return profile;
	}
	
}
