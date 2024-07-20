package Scanner_class;

import java.util.Scanner;

public class Assignment18_odd_even 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = s1.nextInt();
		
		if (number%2 == 0)
		{
			System.out.println("Number "+number+" is even");
		}
		
		else
		{
			System.out.println("Number "+number+" is odd");
		}
		s1.close();
	}

}
