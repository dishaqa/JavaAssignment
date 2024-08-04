package String_functions;

import java.util.Arrays;

public class Anagram
{

	public static void main(String[] args) 
	{
		String name = "face";
		String name1 = "cafe";
		
		if (name.length()!=name1.length())
		{
			System.out.println("Not ANAgram");
		}
		
		else
		{
			char c1[] = name.toCharArray();
			char c2[] = name1.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			Boolean Anagtram_result = Arrays.equals(c1, c2);
			 
			if (Anagtram_result == true)
			{
			System.out.println("Given strings are anagram of each other");
			}
			
			else
			{
			System.out.println("Given strings are not anagram of each other");
			}
		}
		
		

	}

}
