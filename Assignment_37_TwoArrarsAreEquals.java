package Array;

import java.util.Arrays;

public class Assignment_37_TwoArrarsAreEquals {

	public static void main(String[] args) 
	{
		int rollno1[] = new int[4];
		int rollno2[] = new int[4];
		
		rollno1[0] = 10;
		rollno1[1] = 11;
		rollno1[2] = 12;
		rollno1[3] = 13;
		rollno2[0] = 10;
		rollno2[1] = 11;
		rollno2[2] = 12;
		rollno2[3] = 13;
		
		boolean b1= Arrays.equals(rollno1, rollno2);
		if((b1) ==true)
		{
			System.out.println("Both given arrays are equals");
		}
		else 
		{
			System.out.println("Both given arrays are not equals");
		}
	}

}
