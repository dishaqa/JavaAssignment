package String_functions;

import java.util.Arrays;

public class Assignment_36_37_find_NumberSpaceAlphabentSpecialChar {
	
	// declare the count in starting
	static int countspace = 0;
	static int alphanetcount =0;
	static int digitcount = 0;
	static int specialchar =0;
	
	public static void main(String[] args) 
	{
	// declare the string you want to take	
	String input="school no 1 $@#%";
	char c1[]= input.toCharArray();
	System.out.println("Given input is" + (input));
	System.out.println("taken in Array"+Arrays.toString(c1));
	
	//--------------------Finding the Alphabetic ------------------------
	
	//System.out.println("find Alphabet");
	for (int i=0;i<input.length();i++)
	{
	
	boolean Answer1 = Character.isAlphabetic(c1[i]);
	//System.out.println(Answer1);
	if (Answer1 == true)
	{
			alphanetcount++;
	}
	}
	System.out.println("totla number of Alphabets: "+alphanetcount);
	
	
	//----------------------Finding the Numeric--------------------
	//System.out.println("find Digit");
	for (int j=0; j<input.length();j++)
	{	
	boolean Answer2 = Character.isDigit(c1[j]);
	//System.out.println(Answer2);
	if(Answer2== true )
	{
		digitcount = digitcount + 1;
	}
	}
	System.out.println("totla number of digit: "+digitcount);
	//--------------------------Finding the Space----------------
	
	//System.out.println("find space");
	for (int k=0;k<input.length();k++)
	{
	boolean Answer3 =Character.isSpaceChar(c1[k]);
	//System.out.println(Answer3);
	
	if (Answer3 == true) 
	{
	countspace = countspace+1;
	}
	}
	System.out.println("totla number of space: "+countspace);
	
	
	//-----------------check the special character in string----------------
	
	int totallengthofstring= input.length();
	//System.out.println(totallengthofstring);
	int numberOfSpecialChar = totallengthofstring - (countspace+digitcount+alphanetcount);
	
	System.out.println("totla number of Special character: "+numberOfSpecialChar);
	
}
}
